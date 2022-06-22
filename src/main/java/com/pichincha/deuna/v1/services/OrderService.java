package com.pichincha.deuna.v1.services;

import com.pichincha.deuna.exception.BusinessException;
import com.pichincha.deuna.model.dto.ItemDto;
import com.pichincha.deuna.model.dto.OrderHeaderDto;
import com.pichincha.deuna.model.dto.ProductDto;
import com.pichincha.deuna.model.dto.ProductStockOnlyDto;
import com.pichincha.deuna.v1.model.*;
import com.pichincha.deuna.v1.model.mapper.OrderHeaderMapper;
import com.pichincha.deuna.v1.model.mapper.ProductMapper;
import com.pichincha.deuna.v1.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    @Autowired
    private OrderHeaderRepository orderHeaderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductStoreRepository productStoreRepository;
    @Autowired
    private OrderHeaderMapper orderHeaderMapper;
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductMapper productMapper;

    @Transactional
    public OrderHeaderDto createOrder(Long idClient, List<ItemDto> body) {
        Client client = clientRepository.findById(idClient)
                .orElseThrow(() -> new BusinessException("P-204", HttpStatus.INTERNAL_SERVER_ERROR, "No se encuentra el cliente."));

        OrderHeader orderHeader = new OrderHeader();
        orderHeader.setClient(client);
        orderHeader.setDateOrder(LocalDate.now());
        orderHeaderRepository.save(orderHeader);

        List<OrderDetail> orderDetailList = getOrderDetails(body, orderHeader);

        BigDecimal total = new BigDecimal(0);
        total = getTotalAmountOrder(orderDetailList, total);
        //Set total Order
        orderHeader.setTotal(total);
        orderHeaderRepository.save(orderHeader);

        return orderHeaderMapper.toOrderHeaderDto(orderHeader);

    }

    private BigDecimal getTotalAmountOrder(List<OrderDetail> orderDetailList, BigDecimal total) {
        for (OrderDetail orderDetail : orderDetailList) {
            BigDecimal pricePerAmount = new BigDecimal(0);
            pricePerAmount = orderDetail.getPrice().multiply(new BigDecimal(orderDetail.getAmount()));
            total = total.add(pricePerAmount);
            orderDetailRepository.save(orderDetail);

        }
        return total;
    }

    private List<OrderDetail> getOrderDetails(List<ItemDto> body, OrderHeader orderHeader) {
        List<OrderDetail> orderDetailList = new ArrayList<>();
        body.forEach((final ItemDto itemDto) -> {
            ProductStore productStore = productStoreRepository.getProductStoreByProductAndStore(itemDto.getIdProduct(), itemDto.getIdStore())
                    .orElseThrow(() -> new BusinessException("P-204", HttpStatus.INTERNAL_SERVER_ERROR, "No se encuentra el producto en la tienda."));

            Product product = productStore.getProduct();

            validateStock(product, itemDto.getAmount());

            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setProductStore(productStore);
            orderDetail.setAmount(itemDto.getAmount());
            orderDetail.setOrderHeader(orderHeader);
            orderDetail.setPrice(product.getPrice());

            //Decrease product stock
            Integer currentStock = product.getStock() - orderDetail.getAmount();
            ProductDto productDto = productMapper.toProductDto(product);
            productDto.setStock(currentStock);
            productService.update(product.getId(), productDto);

            orderDetailList.add(orderDetail);
        });
        return orderDetailList;
    }

    private void validateStock(final Product product, final Integer amount){
        if(amount > product.getStock()) {
            Integer missingStock = amount - product.getStock();
            if(missingStock > 10)
                throw new BusinessException("P-204", HttpStatus.INTERNAL_SERVER_ERROR
                        , "Transacción no completada. Faltante es por mas de 10 unidades.");
        }





    }

}

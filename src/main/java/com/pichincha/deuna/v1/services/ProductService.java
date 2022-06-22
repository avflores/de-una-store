package com.pichincha.deuna.v1.services;

import com.pichincha.deuna.exception.BusinessException;
import com.pichincha.deuna.v1.model.Product;
import com.pichincha.deuna.model.dto.ProductDto;
import com.pichincha.deuna.model.dto.ProductListDto;
import com.pichincha.deuna.model.dto.ProductStockOnlyDto;
import com.pichincha.deuna.v1.model.mapper.ProductMapper;
import com.pichincha.deuna.v1.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.ValidationException;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

   @Transactional
    public ProductDto save (ProductDto body) {
       Product product = Product.builder()
               .cod(body.getCod())
               .name(body.getName())
               .price(body.getPrice())
               .stock(body.getStock())
               .build();

       return productMapper.toProductDto(productRepository.save(product));
    }

    @Transactional
    public ProductDto update (Long idProduct, ProductDto body) {
        Product product = productRepository.findById(idProduct)
                .orElseThrow(() -> new BusinessException("P-204", HttpStatus.NO_CONTENT, "Not entity with Id"));
        product.setCod(body.getCod());
        product.setName(body.getName());
        product.setPrice(body.getPrice());
        product.setStock(body.getStock());

        return productMapper.toProductDto(productRepository.save(product));
    }

    @Transactional
    public ProductDto update (Long idProduct,  ProductStockOnlyDto body) {
        validate(body);
        Product product = productRepository.findById(idProduct)
                .orElseThrow(() -> new BusinessException("P-204", HttpStatus.NO_CONTENT, "Not entity with Id"));
        product.setStock(body.getStock());

        return productMapper.toProductDto(productRepository.save(product));
    }

    private void validate(ProductStockOnlyDto body) {
       if (Objects.isNull(body.getStock())) {
           throw new ValidationException("Stock cannot be null");
       }
       if (body.getStock() < 1) {
           throw new IllegalArgumentException("Stock must be 1+");
       }
    }

    @Transactional
    public void delete (Long id) {
       productRepository.deleteById(id);
    }

    public ProductDto findById(Long id) {
        Product client = productRepository.findById(id)
                .orElseThrow(() -> new BusinessException("P-204", HttpStatus.NO_CONTENT, "Not entity with Id"));
        return productMapper.toProductDto(client);
    }

    public ProductListDto findAll() {
       ProductListDto products = new ProductListDto();
       products.addAll(productMapper.toProductDtoList(productRepository.findAll()));
       return products;
    }

}

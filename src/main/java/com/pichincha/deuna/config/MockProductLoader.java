package com.pichincha.deuna.config;

import com.pichincha.deuna.v1.model.Product;
import com.pichincha.deuna.v1.model.ProductResponseDto;
import com.pichincha.deuna.v1.repository.ProductRepository;
import com.pichincha.deuna.utils.WebRequester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MockProductLoader {

    @Value("${properties.uri-mock-products}")
    private String uriMockProducts;

    @Autowired
    private ProductRepository productRepository;

    @Bean
    public ProductResponseDto loadProducts() {
        ResponseEntity<ProductResponseDto> productResponseResponseEntity = WebRequester
                .get(uriMockProducts, ProductResponseDto.class);

        List<Product> productList = getProductEntities(productResponseResponseEntity);
        for (Product product: productList) {
            productRepository.save(product);
        }
        return productResponseResponseEntity.getBody();
    }

    private List<Product> getProductEntities(ResponseEntity<ProductResponseDto> productResponseResponseEntity) {
        List<Product> productList = new ArrayList<>(0);
        if (HttpStatus.OK == productResponseResponseEntity.getStatusCode()) {
            productResponseResponseEntity.getBody().getProds().stream().forEach(
                    (prod) -> productList.add(
                        Product.builder()
                                .cod(prod.getCod()).name(prod.getName())
                                .stock(prod.getStock())
                                .price(new BigDecimal(prod.getPrice().toString()))
                                .build())
            );
        }
        return productList;
    }
}

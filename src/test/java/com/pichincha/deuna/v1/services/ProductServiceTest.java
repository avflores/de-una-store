package com.pichincha.deuna.v1.services;

import com.pichincha.deuna.model.dto.ProductDto;
import com.pichincha.deuna.v1.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.pichincha.deuna.v1.model.mapper.ProductMapperImpl;
import com.pichincha.deuna.v1.repository.ProductRepository;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@Import({ProductService.class, ProductMapperImpl.class})
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductMapperImpl productMapper;

    @Test
    void save() {
        ProductDto expectedProductDto = new ProductDto();
        expectedProductDto.setCod("cod");

        Product product = Product.builder().cod("cod").build();
        when(productRepository.save(Mockito.any())).thenReturn(product);

        ProductDto productDto = productService.save(new ProductDto());

        assertEquals(expectedProductDto.getCod(), productDto.getCod());
    }
}
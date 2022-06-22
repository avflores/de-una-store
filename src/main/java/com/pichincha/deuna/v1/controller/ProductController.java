package com.pichincha.deuna.v1.controller;

import com.pichincha.deuna.controller.ProductApi;
import com.pichincha.deuna.model.dto.ProductDto;
import com.pichincha.deuna.model.dto.ProductListDto;
import com.pichincha.deuna.model.dto.ProductStockOnlyDto;
import com.pichincha.deuna.v1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${basePath:/api/deunastore/v1}")
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<ProductListDto> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @Override
    public ResponseEntity<ProductDto> findAByCod(Long idProduct) {
        return ResponseEntity.ok(productService.findById(idProduct));
    }

    @Override
    public ResponseEntity<ProductDto> updateStock(Long idProduct, ProductStockOnlyDto body) {
        return ResponseEntity.ok(productService.update(idProduct, body));
    }

}

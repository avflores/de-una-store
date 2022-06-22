package com.pichincha.deuna.v1.controller;

import com.pichincha.deuna.controller.ProductStoreApi;
import com.pichincha.deuna.model.dto.ProductStoreDto;
import com.pichincha.deuna.v1.services.ProductStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${basePath:/api/deunastore/v1}")
public class ProductStoreController implements ProductStoreApi {

    @Autowired
    private ProductStoreService productStoreService;

    @Override
    public ResponseEntity<ProductStoreDto> save(ProductStoreDto body) {
        return ResponseEntity.ok(productStoreService.save(body));
    }
}

package com.pichincha.deuna.v1.controller;

import com.pichincha.deuna.controller.OrderApi;
import com.pichincha.deuna.model.dto.ItemDto;
import com.pichincha.deuna.model.dto.OrderHeaderDto;
import com.pichincha.deuna.v1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "${basePath:/api/deunastore/v1}")
public class OrderController implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public ResponseEntity<OrderHeaderDto> createOrder(Long idClient, List<ItemDto> body) {
        return ResponseEntity.ok(orderService.createOrder(idClient, body));
    }
}

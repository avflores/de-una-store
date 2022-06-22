package com.pichincha.deuna.v1.controller;

import com.pichincha.deuna.controller.ClientApi;
import com.pichincha.deuna.model.dto.ClientDto;
import com.pichincha.deuna.v1.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${basePath:/api/deunastore/v1}")
public class ClientController implements ClientApi {

    @Autowired
    private ClientService clientService;

    @Override
    public ResponseEntity<ClientDto> save(ClientDto body) {
        return ResponseEntity.ok(clientService.save(body));
    }

    @Override
    public ResponseEntity<ClientDto> update(Long idClient,ClientDto body) {
        return ResponseEntity.ok(clientService.update(idClient, body));
    }

    @Override
    public ResponseEntity<ClientDto> findAById(Long idClient) {
        return ResponseEntity.ok(clientService.findById(idClient));
    }


}

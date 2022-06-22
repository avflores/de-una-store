package com.pichincha.deuna.v1.services;

import com.pichincha.deuna.exception.BusinessException;
import com.pichincha.deuna.v1.model.Client;
import com.pichincha.deuna.model.dto.ClientDto;
import com.pichincha.deuna.v1.model.mapper.ClientMapper;
import com.pichincha.deuna.v1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapper clientMapper;

   @Transactional
    public ClientDto save (ClientDto body) {
       Client client = Client.builder().document(body.getDocument())
               .name(body.getName())
               .lastName(body.getLastName())
              // .picture(body.getPicture())
               .build();

       return clientMapper.toClientDto(clientRepository.save(client));
    }

    @Transactional
    public ClientDto update (Long idClient,ClientDto body) {
        Client client = clientRepository.findById(idClient)
                .orElseThrow(() -> new BusinessException("P-204", HttpStatus.NO_CONTENT, "Cliente no encontrado."));
        client.setDocument(body.getDocument());
        client.setName(body.getName());
        client.setLastName(body.getLastName());

        return clientMapper.toClientDto(clientRepository.save(client));
    }

    @Transactional
    public void delete (Long id) {
        clientRepository.deleteById(id);
    }

    public ClientDto findById (Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return clientMapper.toClientDto(client.get());
    }

}

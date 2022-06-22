package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.model.dto.ClientDto;
import com.pichincha.deuna.v1.model.Client;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-22T09:41:21-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDto toClientDto(Client entity) {
        if ( entity == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setIdClient( entity.getId() );
        clientDto.setDocument( entity.getDocument() );
        clientDto.setName( entity.getName() );
        clientDto.setLastName( entity.getLastName() );
        clientDto.setPicture( entity.getPicture() );

        return clientDto;
    }

    @Override
    public List<ClientDto> toClientDtoList(List<Client> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ClientDto> list = new ArrayList<ClientDto>( entities.size() );
        for ( Client client : entities ) {
            list.add( toClientDto( client ) );
        }

        return list;
    }
}

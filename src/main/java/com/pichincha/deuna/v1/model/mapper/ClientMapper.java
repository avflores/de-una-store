package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.v1.model.Client;
import com.pichincha.deuna.model.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mapping(target = "idClient", source = "id")
    ClientDto toClientDto (final Client entity);

    List<ClientDto> toClientDtoList(final List<Client> entities);
}

package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.v1.model.OrderHeader;
import com.pichincha.deuna.model.dto.OrderHeaderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderHeaderMapper {

    @Mapping(target = "idOrderHeader", source = "id")
    @Mapping(target = "idClient", source = "client.id")
    OrderHeaderDto toOrderHeaderDto (final OrderHeader entity);

    List<OrderHeaderDto> toOrderHeaderDtoList(final List<OrderHeader> entities);
}

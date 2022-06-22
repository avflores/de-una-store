package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.model.dto.OrderHeaderDto;
import com.pichincha.deuna.v1.model.Client;
import com.pichincha.deuna.v1.model.OrderHeader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-22T09:41:20-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class OrderHeaderMapperImpl implements OrderHeaderMapper {

    @Override
    public OrderHeaderDto toOrderHeaderDto(OrderHeader entity) {
        if ( entity == null ) {
            return null;
        }

        OrderHeaderDto orderHeaderDto = new OrderHeaderDto();

        if ( entity.getId() != null ) {
            orderHeaderDto.setIdOrderHeader( entity.getId().intValue() );
        }
        Long id = entityClientId( entity );
        if ( id != null ) {
            orderHeaderDto.setIdClient( id.intValue() );
        }
        orderHeaderDto.setDateOrder( entity.getDateOrder() );
        if ( entity.getTotal() != null ) {
            orderHeaderDto.setTotal( entity.getTotal().longValue() );
        }

        return orderHeaderDto;
    }

    @Override
    public List<OrderHeaderDto> toOrderHeaderDtoList(List<OrderHeader> entities) {
        if ( entities == null ) {
            return null;
        }

        List<OrderHeaderDto> list = new ArrayList<OrderHeaderDto>( entities.size() );
        for ( OrderHeader orderHeader : entities ) {
            list.add( toOrderHeaderDto( orderHeader ) );
        }

        return list;
    }

    private Long entityClientId(OrderHeader orderHeader) {
        if ( orderHeader == null ) {
            return null;
        }
        Client client = orderHeader.getClient();
        if ( client == null ) {
            return null;
        }
        Long id = client.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}

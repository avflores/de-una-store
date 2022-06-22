package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.model.dto.ProductDto;
import com.pichincha.deuna.v1.model.Product;
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
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toProductDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( entity.getId() );
        productDto.setCod( entity.getCod() );
        productDto.setName( entity.getName() );
        productDto.setPrice( entity.getPrice() );
        productDto.setStock( entity.getStock() );

        return productDto;
    }

    @Override
    public List<ProductDto> toProductDtoList(List<Product> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( entities.size() );
        for ( Product product : entities ) {
            list.add( toProductDto( product ) );
        }

        return list;
    }
}

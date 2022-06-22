package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.v1.model.Product;
import com.pichincha.deuna.model.dto.ProductDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto toProductDto (final Product entity);

    List<ProductDto> toProductDtoList(final List<Product> entities);
}

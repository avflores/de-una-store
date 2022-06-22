package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.v1.model.ProductStore;
import com.pichincha.deuna.model.dto.ProductStoreDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductStoreMapper {

    @Mapping(target = "idProduct", source = "product.id")
    @Mapping(target = "idStore", source = "store.id")
    @Mapping(target = "idProductStore", source = "id")
    ProductStoreDto toProductStoreDto (final ProductStore entity);

    List<ProductStoreDto> toProductStoreDtoList (final List<ProductStore> entities);
}

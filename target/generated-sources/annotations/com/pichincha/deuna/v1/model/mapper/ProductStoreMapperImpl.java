package com.pichincha.deuna.v1.model.mapper;

import com.pichincha.deuna.model.dto.ProductStoreDto;
import com.pichincha.deuna.v1.model.Product;
import com.pichincha.deuna.v1.model.ProductStore;
import com.pichincha.deuna.v1.model.Store;
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
public class ProductStoreMapperImpl implements ProductStoreMapper {

    @Override
    public ProductStoreDto toProductStoreDto(ProductStore entity) {
        if ( entity == null ) {
            return null;
        }

        ProductStoreDto productStoreDto = new ProductStoreDto();

        productStoreDto.setIdProduct( entityProductId( entity ) );
        productStoreDto.setIdStore( entityStoreId( entity ) );
        productStoreDto.setIdProductStore( entity.getId() );

        return productStoreDto;
    }

    @Override
    public List<ProductStoreDto> toProductStoreDtoList(List<ProductStore> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProductStoreDto> list = new ArrayList<ProductStoreDto>( entities.size() );
        for ( ProductStore productStore : entities ) {
            list.add( toProductStoreDto( productStore ) );
        }

        return list;
    }

    private Long entityProductId(ProductStore productStore) {
        if ( productStore == null ) {
            return null;
        }
        Product product = productStore.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityStoreId(ProductStore productStore) {
        if ( productStore == null ) {
            return null;
        }
        Store store = productStore.getStore();
        if ( store == null ) {
            return null;
        }
        Long id = store.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}

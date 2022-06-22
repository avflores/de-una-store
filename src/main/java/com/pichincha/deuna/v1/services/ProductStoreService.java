package com.pichincha.deuna.v1.services;

import com.pichincha.deuna.v1.model.Product;
import com.pichincha.deuna.v1.model.ProductStore;
import com.pichincha.deuna.v1.model.Store;
import com.pichincha.deuna.model.dto.ProductStoreDto;
import com.pichincha.deuna.v1.model.mapper.ProductStoreMapper;
import com.pichincha.deuna.v1.repository.ProductRepository;
import com.pichincha.deuna.v1.repository.ProductStoreRepository;
import com.pichincha.deuna.v1.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ProductStoreService {
    @Autowired
    private ProductStoreRepository productStoreRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private StoreRepository storeRepository;
    @Autowired
    private ProductStoreMapper productStoreMapper;
    @Transactional
    public ProductStoreDto save(ProductStoreDto body) {
        Optional<Product> product = productRepository.findById(body.getIdProduct());
        Optional<Store> store = storeRepository.findById(body.getIdStore());

        ProductStore productStore = ProductStore.builder()
                .product(product.get())
                .store(store.get())
                .build();

        return productStoreMapper.toProductStoreDto(productStoreRepository.save(productStore));

    }
}

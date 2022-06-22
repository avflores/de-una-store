package com.pichincha.deuna.v1.repository;

import com.pichincha.deuna.v1.model.ProductStore;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("productStoreRepository")
public interface ProductStoreRepository extends CrudRepository<ProductStore, Long> {

    @Query(value = "from ProductStore ps join ps.product p join ps.store s where p.id = :idProduct and s.id = :idStore")
    public  Optional<ProductStore> getProductStoreByProductAndStore(@Param("idProduct")Long idProduct, @Param("idStore")Long idStore);

}

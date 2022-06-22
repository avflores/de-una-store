package com.pichincha.deuna.v1.repository;

import com.pichincha.deuna.v1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

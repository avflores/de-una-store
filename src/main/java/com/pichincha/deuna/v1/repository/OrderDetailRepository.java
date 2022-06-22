package com.pichincha.deuna.v1.repository;

import com.pichincha.deuna.v1.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}

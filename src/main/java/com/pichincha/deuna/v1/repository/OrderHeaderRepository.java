package com.pichincha.deuna.v1.repository;

import com.pichincha.deuna.v1.model.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}

package com.pichincha.deuna.v1.repository;

import com.pichincha.deuna.v1.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

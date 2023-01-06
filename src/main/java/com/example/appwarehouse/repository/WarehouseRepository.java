package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "warehouse")
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

    boolean existsByName(String name);

    List<Warehouse> getWarehouseByActive(Boolean active);
}
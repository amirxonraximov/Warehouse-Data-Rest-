package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Supplier;
import com.example.appwarehouse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    boolean existsSupplierByPhoneNumber(String phoneNumber);

    List<Supplier> getSupplierByActive(Boolean active);
}

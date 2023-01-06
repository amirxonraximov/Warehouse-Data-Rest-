package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Client;
import com.example.appwarehouse.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends JpaRepository<Client, Integer> {

    boolean existsClientByPhoneNumber(String phoneNumber);

    List<Client> getClientByActive(Boolean active);
}

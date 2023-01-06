package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

    boolean existsByName(String name);

    List<Currency> getCurrencyByActive(Boolean active);


}

package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input, Integer> {
    @Query(nativeQuery = true, value = "select code from input order by code desc limit 1")
    Optional<Integer> getHighestCode();

    List<Input> getInputByDate(Date date);
}

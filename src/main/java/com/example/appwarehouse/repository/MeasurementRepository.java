package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    boolean existsByName(String name);

    List<Measurement> getMeasurementByActive(Boolean active);

}
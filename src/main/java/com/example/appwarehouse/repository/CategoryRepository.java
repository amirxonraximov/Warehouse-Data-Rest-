package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> getCategoriesByActive(Boolean active);

}

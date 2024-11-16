package com.enterprise.artiplushubapi.repository;

import com.enterprise.artiplushubapi.model.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {

}

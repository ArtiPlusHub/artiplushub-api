package com.enterprise.artiplushubapi.service;

import com.enterprise.artiplushubapi.model.entity.Categories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdminCategoryService {
    List<Categories> getAll();
    Page<Categories> paginate(Pageable pageable);
    Categories findById(int id);
    Categories create(Categories category);
    Categories update(int id, Categories category);
    void delete(int id);
}

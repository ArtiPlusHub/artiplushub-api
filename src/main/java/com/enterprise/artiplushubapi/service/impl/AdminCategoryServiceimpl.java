package com.enterprise.artiplushubapi.service.impl;

import com.enterprise.artiplushubapi.model.entity.Categories;
import com.enterprise.artiplushubapi.repository.CategoryRepository;
import com.enterprise.artiplushubapi.service.AdminCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminCategoryServiceimpl implements AdminCategoryService {
    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Categories> getAll() {
        return categoryRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Categories> paginate(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Categories findById(int id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @Transactional
    @Override
    public Categories create(Categories category) {
        category.setCreateAt(LocalDateTime.now());
        return categoryRepository.save(category);
    }

    @Transactional
    @Override
    public Categories update(int id, Categories updateCategory) {
        Categories categoryFromDb = findById(id);
        categoryFromDb.setName(updateCategory.getName());
        categoryFromDb.setDescription(updateCategory.getDescription());
        categoryFromDb.setUpdateAt(LocalDateTime.now());
        return categoryRepository.save(categoryFromDb);
    }

    @Transactional
    @Override
    public void delete(int id) {
        Categories category = findById(id);
        categoryRepository.delete(category);
    }
}

package com.enterprise.artiplushubapi.api;

import com.enterprise.artiplushubapi.model.entity.Categories;
import com.enterprise.artiplushubapi.service.AdminCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/admin/categories")
public class AdminCategoryController {
    private final AdminCategoryService adminCategoryService;

    @GetMapping
    public ResponseEntity<List<Categories>> listCategories() {
        return ResponseEntity.ok(adminCategoryService.getAll());
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Categories>> paginateCategories(
            @PageableDefault(size=5, sort="name")Pageable pageable){
        Page<Categories> categories = adminCategoryService.paginate(pageable);
        return new ResponseEntity<Page<Categories>>(categories, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categories> getCategoryById(@PathVariable("id") Integer id) {
        Categories category = adminCategoryService.findById(id);
        return new  ResponseEntity<Categories>(category, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Categories> createCategory(@RequestBody Categories categories) {
        Categories newCategory = adminCategoryService.create(categories);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Categories> updateCategory(@PathVariable("id") Integer id, @RequestBody Categories categories) {
        Categories updatedCategory = adminCategoryService.update(id, categories);
        return new ResponseEntity<>(updatedCategory, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Categories> deleteCategory(@PathVariable("id") Integer id) {
        adminCategoryService.delete(id);
        return new ResponseEntity<Categories>(HttpStatus.NO_CONTENT);
    }

}

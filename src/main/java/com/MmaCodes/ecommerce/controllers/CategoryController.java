package com.MmaCodes.ecommerce.controllers;

import com.MmaCodes.ecommerce.documents.Category;
import com.MmaCodes.ecommerce.services.category.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category/v1/")
@RequiredArgsConstructor
public class CategoryController {

    final private CategoryService categoryService;

    @PostMapping("create")
    public ResponseEntity<Category> createCategory(@RequestBody @Valid Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping("categories/{id}")
    public ResponseEntity<Category> getCategoryId(@PathVariable String id){
        return categoryService.getCategoryId(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category, @PathVariable String id){
        return categoryService.updateCategory(category, id);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable String id){
        return this.categoryService.deleteCategory(id);
    }

    @GetMapping("categories")
    public ResponseEntity<List<Category>> getAllCategories(){
        return this.categoryService.getAllCategories();
    }
}

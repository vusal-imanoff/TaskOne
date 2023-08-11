package com.example.paymentsvc.controller;

import com.example.paymentsvc.entity.CategoryEntity;
import com.example.paymentsvc.repository.CategoryRepository;
import com.example.paymentsvc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryEntity> getCategories() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryEntity> getCategory(@PathVariable Long id) {

        CategoryEntity category = categoryService.getCategory(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}

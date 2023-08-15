package com.example.paymentsvc.controller;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.entity.CategoryEntity;
import com.example.paymentsvc.repository.CategoryRepository;
import com.example.paymentsvc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryResponse> getCategories() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public CategoryResponse getCategory(@PathVariable Long id) {

        return categoryService.getCategory(id);
    }
}

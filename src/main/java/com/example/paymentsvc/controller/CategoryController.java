package com.example.paymentsvc.controller;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

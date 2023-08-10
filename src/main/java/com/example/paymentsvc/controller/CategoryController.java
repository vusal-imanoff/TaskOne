package com.example.paymentsvc.controller;

import com.example.paymentsvc.entity.Category;
import com.example.paymentsvc.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @GetMapping()
    public List<Category> getCategories()
    {
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> getCategory(@PathVariable Long id)
    {
        Optional<Category> category = categoryRepository.findById(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}

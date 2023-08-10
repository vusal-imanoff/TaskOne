package com.example.paymentsvc.service;

import com.example.paymentsvc.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> getAll();

    public Optional<Category> getCategory(Long id);
}

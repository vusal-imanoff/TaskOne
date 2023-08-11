package com.example.paymentsvc.service;

import com.example.paymentsvc.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryEntity> getAll();
    CategoryEntity getCategory(Long id);
}

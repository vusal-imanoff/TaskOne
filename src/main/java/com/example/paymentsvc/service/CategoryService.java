package com.example.paymentsvc.service;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryResponse> getAll();
    CategoryResponse getCategory(Long id);
}

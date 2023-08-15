package com.example.paymentsvc.service;

import com.example.paymentsvc.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAll();

    CategoryResponse getCategory(Long id);
}

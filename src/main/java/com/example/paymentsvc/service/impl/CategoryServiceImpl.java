package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.entity.CategoryEntity;
import com.example.paymentsvc.exception.NotFoundException;
import com.example.paymentsvc.repository.CategoryRepository;
import com.example.paymentsvc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<CategoryEntity> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity getCategory(Long id) {
        return categoryRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}

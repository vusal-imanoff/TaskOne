package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.exception.NotFoundException;
import com.example.paymentsvc.mapper.CategoryMapper;
import com.example.paymentsvc.repository.CategoryRepository;
import com.example.paymentsvc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryResponse> getAll() {

        return categoryMapper.modelsToDTOs(categoryRepository.findAll());
    }

    @Override
    public CategoryResponse getCategory(Long id) {
        return categoryRepository.findById(id)
                .map(category -> categoryMapper.modelToDTO(category))
                .orElseThrow(() -> new NotFoundException("Category is not found"));

    }
}

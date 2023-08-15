package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.entity.CategoryEntity;
import com.example.paymentsvc.exception.NotFoundException;
import com.example.paymentsvc.mapper.CategoryMapperImpl;
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
    private final CategoryMapperImpl categoryMapper;
    @Override
    public List<CategoryResponse> getAll() {

        return categoryMapper.modelsToDTOs(categoryRepository.findAll());
    }

    @Override
    public CategoryResponse getCategory(Long id) {
        CategoryResponse categoryResponse = categoryMapper.modelToDTO(categoryRepository.findById(id).get());
        if (categoryResponse==null)
        {
            throw new NotFoundException("Category is not found");
        }
        return categoryResponse;
    }
}

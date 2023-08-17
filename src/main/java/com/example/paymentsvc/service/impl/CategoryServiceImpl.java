package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.model.response.CategoryResponse;
import com.example.paymentsvc.exception.NotFoundException;
import com.example.paymentsvc.mapper.CategoryMapper;
import com.example.paymentsvc.repository.CategoryRepository;
import com.example.paymentsvc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.paymentsvc.model.constant.ErrorMessages.categoryNotFoundMessage;

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
                .map(categoryMapper::modelToDTO)
                .orElseThrow(() -> new NotFoundException(categoryNotFoundMessage));

    }
}

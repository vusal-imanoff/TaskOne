package com.example.paymentsvc.mapper;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.entity.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface CategoryMapper {
    CategoryResponse modelToDTO(CategoryEntity category);

    List<CategoryResponse> modelsToDTOs(List<CategoryEntity> categoryEntities);
}

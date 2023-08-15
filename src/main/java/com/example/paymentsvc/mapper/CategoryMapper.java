package com.example.paymentsvc.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel="spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {
    CategoryResponse modelToDTO(CategoryEntity category);

    List<CategoryResponse> modelsToDTOs(List<CategoryEntity> categoryEntities);
}

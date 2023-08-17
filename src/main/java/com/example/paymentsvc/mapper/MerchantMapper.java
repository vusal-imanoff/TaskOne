package com.example.paymentsvc.mapper;

import com.example.paymentsvc.model.response.MerchantResponse;
import com.example.paymentsvc.entity.MerchantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface MerchantMapper {
    @Mapping(target = "categoryId", source = "category.id")
    MerchantResponse modelToDTO(MerchantEntity merchantEntity);
}

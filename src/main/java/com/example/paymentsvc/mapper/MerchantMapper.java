package com.example.paymentsvc.mapper;

import com.example.paymentsvc.dto.response.CategoryResponse;
import com.example.paymentsvc.dto.response.MerchantResponse;
import com.example.paymentsvc.entity.CategoryEntity;
import com.example.paymentsvc.entity.MerchantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MerchantMapper {
    List<MerchantResponse> modelsToDTOs(List<MerchantEntity> merchantEntities);
}

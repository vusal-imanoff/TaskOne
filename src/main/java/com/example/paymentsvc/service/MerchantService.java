package com.example.paymentsvc.service;

import com.example.paymentsvc.dto.response.MerchantResponse;
import com.example.paymentsvc.entity.MerchantEntity;

import java.util.List;

public interface MerchantService {
    List<MerchantResponse> getAll();
    List<MerchantResponse> getAllByCategoryId(Long id);
}

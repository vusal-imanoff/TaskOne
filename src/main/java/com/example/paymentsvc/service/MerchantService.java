package com.example.paymentsvc.service;

import com.example.paymentsvc.model.response.MerchantResponse;

import java.util.List;

public interface MerchantService {
    List<MerchantResponse> getAll();

    List<MerchantResponse> getMerchantsByCategoryId(Long id);
}

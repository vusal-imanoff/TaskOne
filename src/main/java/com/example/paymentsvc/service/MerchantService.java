package com.example.paymentsvc.service;

import com.example.paymentsvc.entity.MerchantEntity;

import java.util.List;

public interface MerchantService {
    List<MerchantEntity> getAll();
    List<MerchantEntity> getAllByCategoryId(Long id);
}

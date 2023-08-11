package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.entity.MerchantEntity;
import com.example.paymentsvc.repository.MerchantRepository;
import com.example.paymentsvc.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService {
    private final MerchantRepository mergentRepository;
    @Override
    public List<MerchantEntity> getAll() {
        return mergentRepository.findAll();
    }

    @Override
    public List<MerchantEntity> getAllByCategoryId(Long id) {
        return mergentRepository.findAllByCategoryId(id);
    }
}

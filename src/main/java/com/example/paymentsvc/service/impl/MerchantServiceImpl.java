package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.model.response.MerchantResponse;
import com.example.paymentsvc.exception.NotFoundException;
import com.example.paymentsvc.mapper.MerchantMapper;
import com.example.paymentsvc.repository.MerchantRepository;
import com.example.paymentsvc.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepository merchantRepository;
    private final MerchantMapper merchantMapper;

    @Override
    public List<MerchantResponse> getAll() {
        return merchantMapper.modelsToDTOs(merchantRepository.findAll());
    }

    @Override
    public List<MerchantResponse> getAllByCategoryId(Long id) {
        List<MerchantResponse> merchantResponses = merchantMapper.modelsToDTOs(merchantRepository.findAllByCategoryId(id));

        if (merchantResponses.isEmpty()) {
            throw new NotFoundException("Merchants are not found");
        }
        return merchantResponses;
    }
}

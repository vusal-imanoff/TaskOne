package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.model.response.MerchantResponse;
import com.example.paymentsvc.exception.NotFoundException;
import com.example.paymentsvc.mapper.MerchantMapper;
import com.example.paymentsvc.repository.MerchantRepository;
import com.example.paymentsvc.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.paymentsvc.model.constant.ErrorMessages.merchantNotFoundMessage;

@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepository merchantRepository;
    private final MerchantMapper merchantMapper;

    @Override
    public List<MerchantResponse> getAll() {
       return merchantRepository.findAll()
                .stream()
                .map(merchantMapper::modelToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<MerchantResponse> getMerchantsByCategoryId(Long id) {
        List<MerchantResponse> merchantResponses =
                merchantRepository.findAllByCategoryId(id)
                        .stream()
                        .map(merchantMapper::modelToDTO)
                        .collect(Collectors.toList());

        if (merchantResponses.isEmpty()) {
            throw new NotFoundException(merchantNotFoundMessage);
        }
        return merchantResponses;
    }
}

package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.entity.Mergent;
import com.example.paymentsvc.repository.MergentRepository;
import com.example.paymentsvc.service.MergentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MergentServiceImpl implements MergentService {
    private final MergentRepository mergentRepository;
    @Override
    public List<Mergent> getAll() {
        return mergentRepository.findAll();
    }

    @Override
    public List<Mergent> getAllByCategoryId(Long id) {
        return mergentRepository.findAllByCategoryId(id);
    }
}

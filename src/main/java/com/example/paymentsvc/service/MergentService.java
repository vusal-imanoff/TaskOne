package com.example.paymentsvc.service;

import com.example.paymentsvc.entity.Mergent;

import java.util.List;

public interface MergentService {
    public List<Mergent> getAll();
    public List<Mergent> getAllByCategoryId(Long id);
}

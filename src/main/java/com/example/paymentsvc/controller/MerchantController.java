package com.example.paymentsvc.controller;

import com.example.paymentsvc.dto.response.MerchantResponse;
import com.example.paymentsvc.entity.MerchantEntity;
import com.example.paymentsvc.service.MerchantService;
import com.example.paymentsvc.service.impl.MerchantServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("merchants")
public class MerchantController {

    private final MerchantServiceImpl merchantService;

    @GetMapping
    public List<MerchantResponse> getAll() {
        return merchantService.getAll();
    }

    @GetMapping("/{id}")
    public List<MerchantResponse> getMerchantByCategoryId(@PathVariable Long id) {
        return merchantService.getAllByCategoryId(id);
    }
}

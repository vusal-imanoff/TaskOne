package com.example.paymentsvc.controller;

import com.example.paymentsvc.model.response.MerchantResponse;
import com.example.paymentsvc.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/merchants")
public class MerchantController {

    private final MerchantService merchantService;

    @GetMapping
    public List<MerchantResponse> getAll() {
        return merchantService.getAll();
    }

    @GetMapping("/{id}")
    public List<MerchantResponse> getMerchantsByCategoryId(@PathVariable Long id) {
        return merchantService.getMerchantsByCategoryId(id);
    }
}

package com.example.paymentsvc.controller;

import com.example.paymentsvc.model.response.MerchantResponse;
import com.example.paymentsvc.service.impl.MerchantServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/erchants")
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

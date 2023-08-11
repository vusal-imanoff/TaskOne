package com.example.paymentsvc.controller;

import com.example.paymentsvc.entity.MerchantEntity;
import com.example.paymentsvc.service.impl.MerchantServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("merchants")
public class MerchantController {
    private final MerchantServiceImpl mergentService;

    @GetMapping("")
    public List<MerchantEntity> getMergents()
    {
        return mergentService.getAll();
    }

    @GetMapping("/{id}")
    public List<MerchantEntity> getMergent(@PathVariable Long id)
    {
        return mergentService.getAllByCategoryId(id);
    }
}

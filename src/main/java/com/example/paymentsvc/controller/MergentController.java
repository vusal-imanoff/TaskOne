package com.example.paymentsvc.controller;

import com.example.paymentsvc.entity.Category;
import com.example.paymentsvc.entity.Mergent;
import com.example.paymentsvc.repository.CategoryRepository;
import com.example.paymentsvc.repository.MergentRepository;
import com.example.paymentsvc.service.impl.MergentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("mergents")
public class MergentController {
    private final MergentServiceImpl mergentService;

    @GetMapping("")
    public List<Mergent> getMergents()
    {
        return mergentService.getAll();
    }

    @GetMapping("/{id}")
    public List<Mergent> getMergent(@PathVariable Long id)
    {
        return mergentService.getAllByCategoryId(id);
    }
}

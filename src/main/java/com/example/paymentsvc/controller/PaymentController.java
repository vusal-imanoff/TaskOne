package com.example.paymentsvc.controller;

import com.example.paymentsvc.model.dto.DebtDto;
import com.example.paymentsvc.model.dto.PaymentDto;
import com.example.paymentsvc.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/payClient")
public class PaymentController {

    private final PaymentService payClientImpl;

    @GetMapping
    public List<PaymentDto> getPayments() {
        return payClientImpl.getPayments();
    }

    @GetMapping("/{accountCode}")
    public DebtDto getDebtByAccountCode(@PathVariable Long accountCode) {
        return payClientImpl.getDebtByAccountCode(accountCode);
    }

    @PostMapping
    public Long requestPayment(@RequestBody PaymentDto payment) {
        return payClientImpl.requestPayment(payment);
    }

    @PostMapping("/{id}")
    public void submitPayment(@PathVariable Long id) {
        payClientImpl.submitPayment(id);
    }
}

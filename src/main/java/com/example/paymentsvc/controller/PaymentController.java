package com.example.paymentsvc.controller;

import com.example.paymentsvc.model.DebtDto;
import com.example.paymentsvc.model.PaymentDto;
import com.example.paymentsvc.service.impl.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("payClient")
public class PaymentController {

    private final PaymentServiceImpl payClientImpl;

    @GetMapping
    public List<PaymentDto> getPayments()
    {
        return payClientImpl.getPayments();
    }

    @GetMapping("/{accountCode}")
    public DebtDto getDebtByAccountCode(@PathVariable Long accountCode) {
        return payClientImpl.getDebtByAccountCode(accountCode);
    }

    @PostMapping
    public Long paymentRequest(@RequestBody PaymentDto payment) {
        return payClientImpl.paymentRequest(payment);
    }

    @PostMapping("/{id}")
    public void paymentSubmit(@PathVariable Long id) {
        payClientImpl.paymentSubmit(id);
    }
}

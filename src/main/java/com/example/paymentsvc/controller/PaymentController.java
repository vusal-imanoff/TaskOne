package com.example.paymentsvc.controller;

import com.example.paymentsvc.model.Debt;
import com.example.paymentsvc.model.Payment;
import com.example.paymentsvc.client.impl.PayClientImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("payClient")
public class PaymentController {

    private final PayClientImpl payClientImpl;

    @GetMapping
    public List<Payment> getPayments()
    {
        return payClientImpl.getPayments();
    }

    @GetMapping("/{accountCode}")
    public Debt getDebtByAccountCode(@PathVariable Long accountCode) {
        return payClientImpl.getDebtByAccountCode(accountCode);
    }

    @PostMapping
    public Long paymentRequest(@RequestBody Object object) {
        return payClientImpl.PaymentRequest(object);
    }

    @PostMapping("/{id}")
    public void paymentSubmit(@PathVariable Long id) {
        payClientImpl.paymentSubmit(id);
    }
}

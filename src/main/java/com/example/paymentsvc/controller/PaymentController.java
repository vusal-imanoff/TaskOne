package com.example.paymentsvc.controller;

import com.example.paymentsvc.service.impl.PayClientImpl;
import com.example.paymentsvc.util.PayClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("payClient")
public class PaymentController {
    private final PayClientImpl payClientImpl;

    @GetMapping
    public List<Object> getPayments()
    {
        return payClientImpl.getPayments();
    }

    @GetMapping("/{accountCode}")
    public ResponseEntity<Object> getDebtByAccountCode(@PathVariable Long accountCode)
    {
        return payClientImpl.getDebtByAccountCode(accountCode);
    }

    @PostMapping
    public Long paymentRequest(@RequestBody Object object)
    {
        return payClientImpl.PaymentRequest(object);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Object> paymentSubmit(@PathVariable Long id)
    {
        return payClientImpl.paymentSubmit(id);
    }
}

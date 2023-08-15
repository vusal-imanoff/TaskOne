package com.example.paymentsvc.client;

import com.example.paymentsvc.model.Debt;
import com.example.paymentsvc.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "pay-client",url = "http://localhost:8080/pay")
public interface PayClient {

    @GetMapping
    List<Payment> getPayments();

    @GetMapping("/{accountCode}")
    Debt getDebtByAccountCode(@PathVariable Long accountCode);

    @PostMapping
    Long PaymentRequest(@RequestBody Object object);

    @PostMapping("/{id}")
    void paymentSubmit(@PathVariable Long id );
}

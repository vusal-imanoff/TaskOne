package com.example.paymentsvc.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "feign",url = "http://localhost:8080/pay")
public interface PayClient {

    @GetMapping("")
    List<Object> getPayments();

    @GetMapping("/{accountCode}")
    ResponseEntity<Object> getDebtByAccountCode(@PathVariable Long accountCode);

    @PostMapping()
    Long PaymentRequest(@RequestBody Object object);

    @PostMapping("/{id}")
    ResponseEntity<Object> paymentSubmit(@PathVariable Long id );
}

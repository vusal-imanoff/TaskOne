package com.example.paymentsvc.client;

import com.example.paymentsvc.model.dto.DebtDto;
import com.example.paymentsvc.model.dto.PaymentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "pay-client", url = "http://localhost:8080/pay")
public interface PayClient {

    @GetMapping
    List<PaymentDto> getPayments();

    @GetMapping("/{accountCode}")
    DebtDto getDebtByAccountCode(@PathVariable Long accountCode);

    @PostMapping
    Long paymentRequest(@RequestBody PaymentDto payment);

    @PostMapping("/{id}")
    void paymentSubmit(@PathVariable Long id);
}

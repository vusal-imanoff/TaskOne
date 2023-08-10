package com.example.paymentsvc.controller;

import com.example.paymentsvc.util.FeignService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.Get;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("feign")
public class PaymentController {
    private final FeignService feignService;

    @GetMapping("payments")
    public List<Object> getPayments()
    {
        return feignService.getPayments();
    }

    @GetMapping("/getDebt/{accountCode}")
    public ResponseEntity<Object> getDebtByAccountCode(@PathVariable Long accountCode)
    {
        return feignService.getDebtByAccountCode(accountCode);
    }

    @PostMapping("")
    public Long paymentRequest(@RequestBody Object object)
    {
        return feignService.PaymentRequest(object);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> paymentSubmit(@PathVariable Long id)
    {
        return feignService.paymentSubmit(id);
    }
}

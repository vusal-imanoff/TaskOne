package com.example.paymentsvc.client.impl;

import com.example.paymentsvc.client.PayClient;
import com.example.paymentsvc.model.Debt;
import com.example.paymentsvc.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayClientImpl {
    private final PayClient payClient;
    public List<Payment> getPayments() {
        return payClient.getPayments();
    }

    public Debt getDebtByAccountCode(Long accountCode) {
        return payClient.getDebtByAccountCode(accountCode);
    }

    public Long PaymentRequest(Object object) {
        return payClient.PaymentRequest(object);
    }

    public void paymentSubmit(Long id) {
        payClient.paymentSubmit(id);
    }
}

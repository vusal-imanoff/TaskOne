package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.util.PayClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayClientImpl {
    private final PayClient payClient;
    public List<Object> getPayments() {
        return payClient.getPayments();
    }

    public ResponseEntity<Object> getDebtByAccountCode(Long accountCode) {
        return payClient.getDebtByAccountCode(accountCode);
    }

    public Long PaymentRequest(Object object) {
        return payClient.PaymentRequest(object);
    }

    public ResponseEntity<Object> paymentSubmit(Long id) {
        return payClient.paymentSubmit(id);
    }
}

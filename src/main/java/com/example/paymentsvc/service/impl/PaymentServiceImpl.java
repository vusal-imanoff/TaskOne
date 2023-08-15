package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.client.PayClient;
import com.example.paymentsvc.model.DebtDto;
import com.example.paymentsvc.model.PaymentDto;
import com.example.paymentsvc.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PayClient payClient;

    public List<PaymentDto> getPayments() {
        return payClient.getPayments();
    }

    public DebtDto getDebtByAccountCode(Long accountCode) {
        return payClient.getDebtByAccountCode(accountCode);
    }

    public Long paymentRequest(PaymentDto payment) {
        return payClient.paymentRequest(payment);
    }

    public void paymentSubmit(Long id) {
        payClient.paymentSubmit(id);
    }
}

package com.example.paymentsvc.service.impl;

import com.example.paymentsvc.client.PayClient;
import com.example.paymentsvc.model.dto.DebtDto;
import com.example.paymentsvc.model.dto.PaymentDto;
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

    public Long requestPayment(PaymentDto payment) {
        return payClient.requestPayment(payment);
    }

    public void submitPayment(Long id) {
        payClient.submitPayment(id);
    }
}

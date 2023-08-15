package com.example.paymentsvc.service;

import com.example.paymentsvc.model.DebtDto;
import com.example.paymentsvc.model.PaymentDto;

import java.util.List;

public interface PaymentService {
    List<PaymentDto> getPayments();

    DebtDto getDebtByAccountCode(Long accountCode);

    Long paymentRequest(PaymentDto payment);

    void paymentSubmit(Long id);
}

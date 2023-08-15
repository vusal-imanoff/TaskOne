package com.example.paymentsvc.service;

import com.example.paymentsvc.model.dto.DebtDto;
import com.example.paymentsvc.model.dto.PaymentDto;

import java.util.List;

public interface PaymentService {
    List<PaymentDto> getPayments();

    DebtDto getDebtByAccountCode(Long accountCode);

    Long requestPayment(PaymentDto payment);

    void submitPayment(Long id);
}

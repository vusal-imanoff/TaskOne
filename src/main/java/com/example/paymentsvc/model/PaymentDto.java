package com.example.paymentsvc.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PaymentDto {

    private Long id;
    private BigDecimal amount;
    private Integer userId;
    private Integer merchantId;
    private Integer debtId;
    private Integer accountCode;
    private String status;
}

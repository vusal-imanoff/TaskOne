package com.example.paymentsvc.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DebtDto {

    private Long id;
    private Integer merchantId;
    private BigDecimal debt;
    private Long userId;
    private Long accountCode;
}

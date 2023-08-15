package com.example.paymentsvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Debt {
    private Long id;
    private int merchantId;
    private double debt;
    private long userId;
    private long accountCode;
}

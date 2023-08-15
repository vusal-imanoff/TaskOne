package com.example.paymentsvc.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private Long id;
    private double amount;
    private int userId;
    private int merchantId;
    private int debtId;
    private int accountCode;
    private String status;
}

package com.example.paymentsvc.model.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MerchantResponse {

    private Long id;
    private String name;
    private BigDecimal commission;
    private Long categoryId;
}

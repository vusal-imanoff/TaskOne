package com.example.paymentsvc.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantResponse {

    private Long id;
    private String name;
    private Integer commission;
    private Long categoryId;
}

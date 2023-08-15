package com.example.paymentsvc.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantResponse {

    public Long id;
    public String name;
    public Integer commission;
    private Long categoryId;
}

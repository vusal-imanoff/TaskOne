package com.example.paymentsvc.dto.response;

import com.example.paymentsvc.entity.CategoryEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantResponse {

    public Long id;
    public String name;
    public Integer commission;
    private CategoryEntity category;
}

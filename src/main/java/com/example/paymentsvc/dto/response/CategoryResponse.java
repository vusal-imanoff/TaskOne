package com.example.paymentsvc.dto.response;

import com.example.paymentsvc.entity.MerchantEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CategoryResponse {

    private Long id;
    private String name;
    @JsonIgnore
    private Set<MerchantEntity> merchantEntities;
}

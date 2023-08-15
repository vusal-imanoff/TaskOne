package com.example.paymentsvc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "merchants")
public class MerchantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public Integer commission;
    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private CategoryEntity category;

}

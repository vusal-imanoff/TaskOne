package com.example.paymentsvc.repository;

import com.example.paymentsvc.entity.MerchantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRepository extends JpaRepository<MerchantEntity, Long> {

    List<MerchantEntity> findAllByCategoryId(Long id);
}

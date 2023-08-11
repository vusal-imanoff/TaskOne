package com.example.paymentsvc.repository;

import com.example.paymentsvc.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
}

package com.example.paymentsvc.repository;

import com.example.paymentsvc.entity.Mergent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MergentRepository extends JpaRepository<Mergent,Long> {

    List<Mergent> findAllByCategoryId(Long id);
}

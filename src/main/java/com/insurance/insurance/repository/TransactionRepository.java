package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.insurance.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}

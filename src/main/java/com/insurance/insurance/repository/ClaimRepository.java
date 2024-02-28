package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.insurance.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long>{
    
}

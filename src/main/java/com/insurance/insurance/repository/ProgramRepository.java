package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.insurance.model.WellnessProgram;

public interface ProgramRepository extends JpaRepository<WellnessProgram, Long>{
    
}

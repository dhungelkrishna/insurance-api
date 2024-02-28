package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.insurance.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

package com.insurance.insurance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// PolicyID (Primary Key)
// PolicyName
// Description
// CoverageAmount
// PremiumAmount
// StartDate
// EndDate
// UserID (Foreign Key referencing User Table)
@Entity
@Table(name="policy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private Long PolicyID;
    @Column(name="policy_name")
    private String policyName;
    @Column(name="description")
    private String description;
    @Column(name="coverage_amount")
    private double coverageAmount;
    @Column(name="premium_amount")
    private double premiumAmount;

    @Column(name="start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;
    
    public Policy() {
    }
    public Policy(Long policyID, String policyName, String description, double coverageAmount, double premiumAmount,
            LocalDateTime startDate, LocalDateTime endDate, User user) {
        PolicyID = policyID;
        this.policyName = policyName;
        this.description = description;
        this.coverageAmount = coverageAmount;
        this.premiumAmount = premiumAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
    }
    public Long getPolicyID() {
        return PolicyID;
    }
    public void setPolicyID(Long policyID) {
        PolicyID = policyID;
    }
    public String getPolicyName() {
        return policyName;
    }
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getCoverageAmount() {
        return coverageAmount;
    }
    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }
    public double getPremiumAmount() {
        return premiumAmount;
    }
    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }  
}

package com.insurance.insurance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * 
 * Claim Table:

ClaimID (Primary Key)
PolicyID (Foreign Key referencing Policy Table)
ClaimDate
Description
Status (e.g., pending, approved, denied)
 */
@Entity
@Table(name = "claim")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_id")
    private long claimID;
    @ManyToOne
    @JoinColumn(name="policy_id", referencedColumnName="policy_id")
    private Policy policy;
    @Column(name="claim_date")
    private LocalDateTime claimDate;
    @Column(name="claim_description")
    private String description;
    @Column(name="status")
    private String status;
    
    public Claim() {
    }
    public Claim(long claimID, Policy policy, LocalDateTime claimDate, String description, String status) {
        this.claimID = claimID;
        this.policy = policy;
        this.claimDate = claimDate;
        this.description = description;
        this.status = status;
    }
    public long getClaimID() {
        return claimID;
    }
    public void setClaimID(long claimID) {
        this.claimID = claimID;
    }
    public Policy getPolicy() {
        return policy;
    }
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
    public LocalDateTime getClaimDate() {
        return claimDate;
    }
    public void setClaimDate(LocalDateTime claimDate) {
        this.claimDate = claimDate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}

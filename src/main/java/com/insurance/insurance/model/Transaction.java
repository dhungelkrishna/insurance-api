package com.insurance.insurance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/*Payment Transaction Table:

TransactionID (Primary Key)
UserID (Foreign Key referencing User Table)
Amount
TransactionDate
PaymentMethod
Status (e.g., pending, completed) */
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private long transactionID;
    @OneToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;
    @Column(name="amount")
    private double amount;
    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;
    @Column(name = "payment_method")
    private String PaymentMethod;
    @Column(name = "status")
    private boolean status;

    public Transaction() {
    }

    public Transaction(long transactionID, User user, double amount, LocalDateTime transactionDate,
            String paymentMethod, boolean status) {
        this.transactionID = transactionID;
        this.user = user;
        this.amount = amount;
        this.transactionDate = transactionDate;
        PaymentMethod = paymentMethod;
        this.status = status;
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}

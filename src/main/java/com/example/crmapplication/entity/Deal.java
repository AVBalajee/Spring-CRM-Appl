package com.example.crmapplication.entity;
import jakarta.persistence.*;

@Entity
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dealName;

    @ManyToOne
    private Customer customer;

    private double amount;
    private String stage;

    // Constructors, getters, and setters

    public Deal() {
        // Default constructor
    }

    public Deal(String dealName, Customer customer, double amount, String stage) {
        this.dealName = dealName;
        this.customer = customer;
        this.amount = amount;
        this.stage = stage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}

package com.billing.models;

public class Bill {
    private Customer customer;
    private int unitsConsumed;
    private double totalAmount;

    public Bill(Customer customer, int unitsConsumed, double totalAmount) {
        this.customer = customer;
        this.unitsConsumed = unitsConsumed;
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Bill [customer=" + customer + ", unitsConsumed=" + unitsConsumed + ", totalAmount=" + totalAmount + "]";
    }
}
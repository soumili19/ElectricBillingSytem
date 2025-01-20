package com.billing.services;

public class BillCalculator {
    private static final double UNIT_RATE = 5.0; // Example rate per unit

    public static double calculateBill(int unitsConsumed) {
        return unitsConsumed * UNIT_RATE;
    }
}

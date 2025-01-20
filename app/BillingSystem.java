package com.billing.app;

import com.billing.controllers.BillingController;

public class BillingSystem {
    public static void main(String[] args) {
        BillingController controller = new BillingController();
        controller.start();
    }
}
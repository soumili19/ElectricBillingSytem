package com.billing.controllers;

import com.billing.services.BillingService;
import java.util.Scanner;

public class BillingController {
    private BillingService billingService = new BillingService();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Electric Billing System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    billingService.addCustomer(customerId, name, address);
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Units Consumed: ");
                    int units = scanner.nextInt();
                    billingService.generateBill(id, units);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

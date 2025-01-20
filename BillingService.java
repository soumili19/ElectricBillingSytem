package com.billing.services;

import com.billing.models.Bill;
import com.billing.models.Customer;
import com.billing.repositories.BillRepository;
import com.billing.repositories.CustomerRepository;

public class BillingService {
    private CustomerRepository customerRepo = new CustomerRepository();
    private BillRepository billRepo = new BillRepository();

    public void addCustomer(String customerId, String name, String address) {
        if (!customerRepo.customerExists(customerId)) {
            customerRepo.addCustomer(new Customer(customerId, name, address));
        } else {
            System.out.println("Customer already exists!");
        }
    }

    public void generateBill(String customerId, int unitsConsumed) {
        Customer customer = customerRepo.getCustomer(customerId);
        if (customer != null) {
            double totalAmount = BillCalculator.calculateBill(unitsConsumed);
            Bill bill = new Bill(customer, unitsConsumed, totalAmount);
            billRepo.saveBill(bill);
            System.out.println("Bill generated: " + bill);
        } else {
            System.out.println("Customer not found!");
        }
    }
}

package com.billing.repositories;

import com.billing.models.Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
    private Map<String, Customer> customerData = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerData.put(customer.getCustomerId(), customer);
    }

    public Customer getCustomer(String customerId) {
        return customerData.get(customerId);
    }

    public boolean customerExists(String customerId) {
        return customerData.containsKey(customerId);
    }
}
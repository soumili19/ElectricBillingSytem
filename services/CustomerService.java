

import com.billing.models.Customer;
import com.billing.repositories.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();

    // Add a customer
    public void addCustomer(String customerId, String name, String address) {
        if (!customerRepository.customerExists(customerId)) {
            Customer customer = new Customer(customerId, name, address);
            customerRepository.addCustomer(customer);
            System.out.println("Customer added: " + customer);
        } else {
            System.out.println("Customer with ID " + customerId + " already exists.");
        }
    }

    // Get a customer by ID
    public Customer getCustomer(String customerId) {
        return customerRepository.getCustomer(customerId);
    }

    // Check if customer exists
    public boolean customerExists(String customerId) {
        return customerRepository.customerExists(customerId);
    }
}
package com.example.demo.customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    Customer getCustomer(String id);

    void registerCustomer(Customer customer);

    void deleteCustomer(String id);
}

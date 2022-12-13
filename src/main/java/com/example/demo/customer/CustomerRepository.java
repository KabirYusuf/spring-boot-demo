package com.example.demo.customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getCustomers();
    void deleteCustomer(String id);
    void updateCustomer(String id, Customer customer);
    void registerCustomer(Customer customer);

}

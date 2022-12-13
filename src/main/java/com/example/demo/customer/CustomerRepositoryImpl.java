package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class CustomerRepositoryImpl implements CustomerRepository{
    private List<Customer> customers = new ArrayList<>();
    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public void deleteCustomer(String id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer foundCustomer = customers.get(i);
            if (foundCustomer.getId().equals(id)){
                customers.add(i, customer);
                return;
            }
        }
    }

    @Override
    public void registerCustomer(Customer customer) {
        customers.add(customer);

    }
}

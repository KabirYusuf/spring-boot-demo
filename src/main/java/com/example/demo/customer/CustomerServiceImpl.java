package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers(){
        return customerRepository.getCustomers();
    }

    public Customer getCustomer(String id){
        return getCustomers().
                stream().
                filter(customer -> customer.getId().equals(id)).
                findFirst().
                orElseThrow(() -> new IllegalStateException("No customer found"));
    }

    @Override
    public void registerCustomer(Customer customer) {
        customerRepository.registerCustomer(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(id);
    }
}

package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/customers")
@RestController
public class Controller {
    private final CustomerService customerService;

    @Autowired
    public Controller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    public Customer getCustomer(@PathVariable ("customerId") String id){
        return customerService.getCustomer(id);
    }

    @PostMapping("register")
    public void registerCustomer(@RequestBody Customer customer){
        customerService.registerCustomer(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public  void  deleteCustomer(@PathVariable ("customerId") String id){
        customerService.deleteCustomer(id);
    }
}

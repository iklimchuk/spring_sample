package com.iklimchuk.service;

import com.iklimchuk.model.Customer;
import com.iklimchuk.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl() {
    }

//    public void setCustomerRepository(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

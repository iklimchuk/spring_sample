package com.iklimchuk.repository;

import com.iklimchuk.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    public HibernateCustomerRepositoryImpl() {
        Customer customer = new Customer();
        customer.setFirstName("Igor");
        customer.setLastName("Klimchuk");
        customers.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}

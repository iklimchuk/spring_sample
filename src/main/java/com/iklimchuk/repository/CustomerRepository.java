package com.iklimchuk.repository;

import com.iklimchuk.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

package com.github.juliahormuth.hotelbackend.features.customer.domain;


import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerModel;
import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponse;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerModel createCustomer(CustomerModel customer) {
       return this.customerRepository.save(customer);
    }

    @Override
    public List<CustomerModel> findAll() {
       return this.customerRepository.findAll();
    }

    @Override
    public Optional<CustomerModel> findById(UUID id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public CustomerModel findByName(String name) {
        return this.customerRepository.findByName(name);
    }

    @Override
    public void deleteById(UUID id) throws Exception {
        var customerExists = this.customerRepository.findById(id);
        if (customerExists.isPresent()) {
            this.customerRepository.deleteById(id);
        } else {
            throw new Exception("Customer not found!");
        }
    }

    @Override
    public CustomerModel updateById(CustomerModel customer) throws Exception {
        var customerExists = this.customerRepository.findById(customer.getId());
        if (customerExists.isPresent()) {
           return this.customerRepository.save(customer);
        } else {
           throw new Exception("Customer not found!");
        }
    }
}

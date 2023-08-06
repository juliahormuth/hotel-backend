package com.github.juliahormuth.hotelbackend.features.customer.domain.service;


import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerModel;
import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CustomerModel createCustomer(CustomerModel customer) throws Exception {
        var document = this.customerRepository.findByDocument(customer.getDocument());
        if (document != null) {
            throw new Exception("Customer already exists!");
        }
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
    public List<CustomerModel> findByName(String name) {
        return this.customerRepository.findByName(name);
    }

    @Override
    public CustomerModel findByDocument(String document) {
        return this.customerRepository.findByDocument(document);
    }

    @Override
    public CustomerModel findByPhone(String phone) {
        return this.customerRepository.findByPhone(phone);
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
           this.customerRepository.save(customer);
           return customer;
        } else {
           throw new Exception("Customer not found!");
        }
    }
}

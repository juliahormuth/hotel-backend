package com.github.juliahormuth.hotelbackend.features.customer.domain.service;

import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
  CustomerModel createCustomer(CustomerModel customer) throws Exception;
  List<CustomerModel> findAll();
  Optional<CustomerModel> findById(UUID id);
  List<CustomerModel> findByName(String name);
  CustomerModel findByDocument(String name);
  CustomerModel findByPhone(String name);
  void deleteById(UUID id) throws Exception;
  CustomerModel updateById(CustomerModel customer) throws Exception;
}

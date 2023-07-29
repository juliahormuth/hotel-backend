package com.github.juliahormuth.hotelbackend.features.customer.domain;

import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
  CustomerModel createCustomer(CustomerModel customer);
  List<CustomerModel> findAll();
  Optional<CustomerModel> findById(UUID id);
  CustomerModel findByName(String name);
  void deleteById(UUID id) throws Exception;
  CustomerModel updateById(CustomerModel customer) throws Exception;
}

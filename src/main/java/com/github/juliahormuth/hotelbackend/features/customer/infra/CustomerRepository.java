package com.github.juliahormuth.hotelbackend.features.customer.infra;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository <CustomerModel, UUID> {
    List<CustomerModel> findByName(String name);
    CustomerModel findByDocument(String document);
    CustomerModel findByPhone(String phone);
}

package com.github.juliahormuth.hotelbackend.features.customer.infra;

import com.github.juliahormuth.hotelbackend.features.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository <CustomerModel, UUID> {
    CustomerModel findByName(String name);
}

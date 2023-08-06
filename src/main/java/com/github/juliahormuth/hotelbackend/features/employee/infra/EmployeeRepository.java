package com.github.juliahormuth.hotelbackend.features.employee.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeModel, UUID> {
}

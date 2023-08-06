package com.github.juliahormuth.hotelbackend.features.employee.infra;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeModel {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    private UUID id;

    @Column(name = "document", length = 11)
    private String document;

    @Column(name = "username", length = 20)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;
}
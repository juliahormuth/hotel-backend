package com.github.juliahormuth.hotelbackend.features.customer.infra;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter

@Entity
@Table(name = "CUSTOMER")
public class CustomerModel {

        @Id
        @GeneratedValue(generator = "uuid2")
        @Column(name = "id")
        private UUID id;

        @Column(name = "name", length = 100)
        private String name;

        @Column(name = "document", length = 11)
        private String document;

        @Column(name = "phone")
        private String phone;

        @Column(name = "birth")
        private Date birth;
}

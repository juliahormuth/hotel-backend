package com.github.juliahormuth.hotelbackend.features.customer.infra;

import com.github.juliahormuth.hotelbackend.features.checkin.infra.CheckinModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
import java.util.List;
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

       /* @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
        private List<CheckinModel> checkins;
        */
}

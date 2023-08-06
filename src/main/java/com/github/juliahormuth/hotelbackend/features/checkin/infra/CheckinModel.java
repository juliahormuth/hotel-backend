package com.github.juliahormuth.hotelbackend.features.checkin.infra;

import com.github.juliahormuth.hotelbackend.features.customer.infra.CustomerModel;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "CHECKIN")
public class CheckinModel {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    private UUID id;

    @Column(name = "start_date")
    private Date start;

    @Column(name = "end_date")
    private Date end;

    @Column(name = "garage")
    private Boolean garage;

    @Column(name = "total")
    private Double totalValue;

    /*
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerModel customer;
     */
}

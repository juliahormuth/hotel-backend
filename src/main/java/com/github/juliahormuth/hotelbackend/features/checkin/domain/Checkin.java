package com.github.juliahormuth.hotelbackend.features.checkin.domain;

import com.github.juliahormuth.hotelbackend.features.customer.domain.Customer;

import java.util.Date;
import java.util.UUID;

public class Checkin {
    private UUID id;
    private Customer customer;
    private Date startDate;
    private Date endDate;
    private Boolean garage;
}

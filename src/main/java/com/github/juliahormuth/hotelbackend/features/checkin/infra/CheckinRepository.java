package com.github.juliahormuth.hotelbackend.features.checkin.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckinRepository extends JpaRepository <CheckinModel, UUID> {
}

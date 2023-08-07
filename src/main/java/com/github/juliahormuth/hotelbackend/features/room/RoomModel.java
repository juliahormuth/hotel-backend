package com.github.juliahormuth.hotelbackend.features.room;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter

@Entity
@Table(name = "ROOM")
public class RoomModel {

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    private UUID id;

    @Column(name = "number")
    private int number;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;
}


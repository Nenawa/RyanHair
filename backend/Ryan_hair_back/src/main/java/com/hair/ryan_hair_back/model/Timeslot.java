package com.hair.ryan_hair_back.model;

import jakarta.persistence.*;
import lombok.Data;

import java.text.DateFormat;

@Data
@Entity
public class Timeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "slot_start")
    private DateFormat slotStart;

    @Column(name = "slot_end")
    private DateFormat slotEnd;

}

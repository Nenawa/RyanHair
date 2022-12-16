package com.hair.ryan_hair_back.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;

@Data
@Entity
@Table(name = "timeslot")
public class Timeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timeslot_id")
    private Long id;

    @Column(name = "slot_start")
    @Temporal(TemporalType.DATE)
    private DateFormat slotStart;

    @Temporal(TemporalType.DATE)
    @Column(name = "slot_end")
    private DateFormat slotEnd;

    @Autowired
    public Timeslot(Long id, DateFormat slotStart, DateFormat slotEnd) {
        this.id = id;
        this.slotStart = slotStart;
        this.slotEnd = slotEnd;
    }

    public Timeslot() {

    }
}

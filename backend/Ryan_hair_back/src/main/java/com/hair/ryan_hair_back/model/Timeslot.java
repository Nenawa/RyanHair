package com.hair.ryan_hair_back.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;


@Data
@Entity
@Table(name = "timeslot")
public class Timeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date slotStart;

    @Temporal(TemporalType.DATE)
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date slotEnd;

    @Autowired
    public Timeslot(Long id, Date slotStart, Date slotEnd) {
        this.id = id;
        this.slotStart = slotStart;
        this.slotEnd = slotEnd;
    }

    public Timeslot() {

    }
}

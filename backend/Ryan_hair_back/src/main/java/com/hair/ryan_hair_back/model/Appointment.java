package com.hair.ryan_hair_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Column(nullable = false, name = "telephone")
    private String telephone;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(name="comment", nullable = true, columnDefinition="TEXT")
    private String comment;

    @OneToOne
    @JoinColumn(name = "id_timeslot")
    private Timeslot timeSlot;

    @ManyToOne
    @JoinColumn(name="id_haircut",nullable = false)
    @JsonBackReference
    private Haircut haircut;

    public Appointment() {
    }
}
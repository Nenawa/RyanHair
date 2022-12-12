package com.hair.ryan_hair_back.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
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

    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @Column(name="comment", nullable = true, columnDefinition="TEXT")
    private String comment;

    /* commentaire des clés étrangère

        @OneToOne
        @JoinColumn(name = "id_time_slot")
        private TimeSlot timeSlot;

        @OneToOne
        @JoinColumn(name = "id_haircut")
        private Haircut haircut;
    */
    public Appointment() {
    }
}

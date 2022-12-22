package com.hair.ryan_hair_back.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.hair.ryan_hair_back.enums.HaircutStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "haircut")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Haircut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="haircut_status", nullable = false)
    @Enumerated(EnumType.STRING)
    HaircutStatus status;
    @Column(name="description", nullable = true, columnDefinition="TEXT")
    private String description;

    @OneToMany(mappedBy = "haircut")
    @JsonManagedReference
    private List<Appointment> appointmentList = new ArrayList<>();

    public Haircut() {
    }
}

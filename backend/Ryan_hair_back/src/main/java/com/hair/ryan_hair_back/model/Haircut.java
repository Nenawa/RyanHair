package com.hair.ryan_hair_back.model;

import com.hair.ryan_hair_back.enums.HaircutStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "haircut")
public class Haircut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="haircut_status", nullable = false)
    @Enumerated(EnumType.STRING)
    HaircutStatus status;
    @Column(name="description", nullable = true, columnDefinition="TEXT")
    private String description;

    public Haircut() {
    }
}

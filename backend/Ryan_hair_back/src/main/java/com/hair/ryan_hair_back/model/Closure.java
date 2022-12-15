package com.hair.ryan_hair_back.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "closure")
public class Closure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "closure_id")
    private Long id;

    @Column(name = "closure_start")
    @Temporal(TemporalType.DATE)
    private Date closureStart;

    @Column(name = "closure_end")
    @Temporal(TemporalType.DATE)
    private Date closureEnd;

    public Closure(){}
}

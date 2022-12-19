package com.hair.ryan_hair_back.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    @Column
    private String name;

    @ManyToMany(mappedBy = "role")
    @JsonIgnore
    private Set<User> users =  new HashSet<>();

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long id) {
        this.idRole = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
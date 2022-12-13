package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Role;
import com.hair.ryan_hair_back.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Iterable<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).get();
    }

    public Role saveOrUpdate(Role role) {
        return roleRepository.save(role);
    }

    public void delete(Long id) {
        roleRepository.deleteById(id);
    }
}

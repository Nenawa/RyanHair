package com.hair.ryan_hair_back.controller;

import com.hair.ryan_hair_back.model.Role;
import com.hair.ryan_hair_back.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    
    
        @GetMapping("")
    public Iterable<Role> getAllRole() {
        return roleService.getAllRole();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable("id") Long id) {
        return roleService.getRoleById(id);
    }

    @PostMapping("")
    public Role addRole(@RequestBody Role role) {
        return roleService.saveOrUpdate(role);
    }

    @PutMapping("/{id}")
    public Role updateRole(@RequestBody Role role, @PathVariable("id") Long id) {
        Role newRole = roleService.getRoleById(id);
        newRole.setName(role.getName());
        return roleService.saveOrUpdate(newRole);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable("id") Long id) {
        roleService.delete(id);
    }
}

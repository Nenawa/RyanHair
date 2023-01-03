package com.hair.ryan_hair_back.repository;

import com.hair.ryan_hair_back.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
}

package com.hair.ryan_hair_back.repository;

import com.hair.ryan_hair_back.model.Closure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosureRepository extends JpaRepository<Closure, Long> {
}

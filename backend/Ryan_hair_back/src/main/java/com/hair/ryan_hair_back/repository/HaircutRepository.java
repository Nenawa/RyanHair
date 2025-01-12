package com.hair.ryan_hair_back.repository;

import com.hair.ryan_hair_back.model.Haircut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HaircutRepository extends CrudRepository<Haircut, Long> {
}

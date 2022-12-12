package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Haircut;

import java.util.Optional;


public interface HaircutService {
    //post
    Haircut createHaircut(Haircut haircut);

    //getAll
    Iterable<Haircut> readHaircut();

    //getById
    Optional<Haircut> readOneHaircut(Long id);

    //delete
    void deleteHaircut(Long id);

    //put
    Haircut updateHaircut(Long id, Haircut haircut);
}

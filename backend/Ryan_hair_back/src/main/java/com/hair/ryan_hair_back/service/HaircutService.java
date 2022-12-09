package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Haircut;

import java.util.Optional;


public interface HaircutService {
    //post
    Haircut createHaircut(Haircut haircut);

    //getAll
    Iterable<Haircut> readHaircut();

    Optional<Haircut> readOneHaircut(Long id);

    void deleteHaircut(Long id);

    Haircut updateHaircut(Long id, Haircut haircut);
}

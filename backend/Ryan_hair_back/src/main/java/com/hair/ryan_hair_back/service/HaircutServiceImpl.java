package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Haircut;
import com.hair.ryan_hair_back.repository.HaircutRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HaircutServiceImpl implements HaircutService{

    private HaircutRepository haircutRepository;

    //injection dépendance
    public HaircutServiceImpl(HaircutRepository haircutRepository) {
        this.haircutRepository = haircutRepository;
    }

    @Override
    public Haircut createHaircut(Haircut haircut) {
        return haircutRepository.save(haircut);
    }

    @Override
    public Iterable<Haircut> readHaircut() {
        return haircutRepository.findAll();
    }

    @Override
    public Optional<Haircut> readOneHaircut(Long id) {
        return haircutRepository.findById(id);
    }

    @Override
    public void deleteHaircut(final Long id) {
        haircutRepository.deleteById(id);
    }

    @Override
    public Haircut updateHaircut(Long id, Haircut haircut) {
        return haircutRepository.save(haircut);
    }
}

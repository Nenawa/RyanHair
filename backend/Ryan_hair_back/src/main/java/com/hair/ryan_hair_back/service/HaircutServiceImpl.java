package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Haircut;
import com.hair.ryan_hair_back.repository.HaircutRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HaircutServiceImpl implements HaircutService {

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
    public Optional<Haircut> readOneHaircut(final Long id) {
        return haircutRepository.findById(id);
    }

    @Override
    public void deleteHaircut(final Long id) {
        haircutRepository.deleteById(id);
    }

    @Override
    public Haircut updateHaircut(final Long id, Haircut haircut) {
        var h = haircutRepository.findById(id);
        if (h.isPresent()) {
            var courentHaircut = h.get();
            courentHaircut.setDescription(haircut.getDescription());
            courentHaircut.setStatus(haircut.getStatus());
            courentHaircut.setAppointmentList(haircut.getAppointmentList());
            return haircutRepository.save(courentHaircut);
        } else {
            return null;
        }
    }
}

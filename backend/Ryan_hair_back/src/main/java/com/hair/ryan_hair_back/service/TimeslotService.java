package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Timeslot;
import com.hair.ryan_hair_back.repository.TimeslotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TimeslotService {

    @Autowired
    private TimeslotRepository timeslotRepository;

    public TimeslotService(TimeslotRepository timeslotRepository) {
        this.timeslotRepository = timeslotRepository;
    }

    public Iterable<Timeslot> getAllTimeslots() {
        return timeslotRepository.findAll();
    }

    public Optional<Timeslot> getTimeslotById(final Long id) {
        return timeslotRepository.findById(id);
    }

    public Timeslot saveOrUpdateTimeslot(Timeslot timeslot) {
        Timeslot savedTimeslot = timeslotRepository.save(timeslot);
        return timeslotRepository.save(timeslot);
    }

    public void deleteTimeslotById(Long id) {
        timeslotRepository.deleteById(id);
    }

}

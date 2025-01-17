package com.hair.ryan_hair_back.controller;

import com.hair.ryan_hair_back.model.Timeslot;
import com.hair.ryan_hair_back.service.TimeslotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("api/timeslots")
public class timeslotController {

    @Autowired
    private TimeslotService timeslotService;

    public void TimeslotController(TimeslotService timeslotService) {
        this.timeslotService = timeslotService;
    }

    @GetMapping()
    public ResponseEntity<Iterable<Timeslot>> getAllTimeslots() {
        return ResponseEntity.status(HttpStatus.OK).body(timeslotService.getAllTimeslots());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Timeslot> getTimeslotById(@PathVariable("id") final Long id) {
        Optional<Timeslot> timeslot = timeslotService.getTimeslotById(id);
        if (timeslot.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(timeslot.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping()
    public ResponseEntity<Timeslot> createTimeslot(@RequestBody Timeslot timeslot) {
        return ResponseEntity.status(HttpStatus.CREATED).body(timeslotService.saveOrUpdateTimeslot(timeslot));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Timeslot> updateTimeslot(@PathVariable("id") final Long id, @RequestBody Timeslot timeslot) {
        Optional<Timeslot> t = timeslotService.getTimeslotById(id);
        if (t.isPresent()) {
            Timeslot currentTimeslot = t.get();

            java.util.Date slotStart = timeslot.getSlotStart();
            if (slotStart != null) {
                currentTimeslot.setSlotStart(slotStart);
            }
            Date slotEnd = timeslot.getSlotEnd();
            if (slotEnd != null) {
                currentTimeslot.setSlotEnd(slotEnd);
            }
            timeslotService.saveOrUpdateTimeslot(currentTimeslot);
            return ResponseEntity.status(HttpStatus.CREATED).body(currentTimeslot);

        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTimeslot(@PathVariable("id") final Long id) {
        timeslotService.deleteTimeslotById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Le créneau a été supprimé");
    }

}

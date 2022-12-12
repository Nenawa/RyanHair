package com.hair.ryan_hair_back.controller;

import com.hair.ryan_hair_back.model.Appointment;
import com.hair.ryan_hair_back.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping()
    public Iterable<Appointment> readAppointment(){
        return appointmentService.readHaircut();
    }

    @GetMapping("/{id}")
    public Optional<Appointment> readOneAppointment(@PathVariable Long id){
        return appointmentService.readOneAppointment(id);
    }

    @PostMapping()
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentService.createAppointment(appointment);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment){
        return appointmentService.updateAppointment(id, appointment);
    }

}

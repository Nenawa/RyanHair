package com.hair.ryan_hair_back.controller;

import com.hair.ryan_hair_back.model.Appointment;
import com.hair.ryan_hair_back.model.Haircut;
import com.hair.ryan_hair_back.model.Timeslot;
import com.hair.ryan_hair_back.service.AppointmentService;
import com.hair.ryan_hair_back.service.HaircutService;
import com.hair.ryan_hair_back.service.TimeslotService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private AppointmentService appointmentService;

    private TimeslotService timeslotService;

    private HaircutService haircutService;

    public AppointmentController(AppointmentService appointmentService, TimeslotService timeslotService, HaircutService haircutService) {
        this.appointmentService = appointmentService;
        this.timeslotService = timeslotService;
        this.haircutService = haircutService;
    }

    @GetMapping()
    public Iterable<Appointment> readAppointment() {
        return appointmentService.readAppointment();
    }

    @GetMapping("/{id}")
    public Optional<Appointment> readOneAppointment(@PathVariable Long id) {
        return appointmentService.readOneAppointment(id);
    }

    @PostMapping()
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        return appointmentService.updateAppointment(id, appointment);
    }

    @PutMapping("/{idAppointments}/timeslot/{idTimes}")
    private Appointment changeOneDateAndTime(@PathVariable("idAppointments") final Long idAppointments, @PathVariable("idTimes") final Long idTimes) {
        Optional<Appointment> appointmentOptional = appointmentService.readOneAppointment(idAppointments);
        Optional <Timeslot>timeslotOptional = timeslotService.getTimeslotById(idTimes);

        if (appointmentOptional.isPresent() && timeslotOptional.isPresent()){
            Appointment appointment = appointmentOptional.get();
            Timeslot timeslot = timeslotOptional.get();
            appointment.setTimeSlot(timeslot);
            return appointmentService.updateAppointment(idAppointments, appointment);
        } else {
            return null;
        }
    }

    @PutMapping("/{idAppointments}/haircut/{idHaircut}")
    private Appointment modifyAHaircut(@PathVariable("idAppointments") final Long idAppointments, @PathVariable("idHaircut") final Long idHaircut) {

        Optional<Appointment> appointmentOptional = appointmentService.readOneAppointment(idAppointments);
        Optional<Haircut> haircutOptional = haircutService.readOneHaircut(idHaircut);

        if (appointmentOptional.isPresent() && haircutOptional.isPresent()) {
            Appointment appointment = appointmentOptional.get();
            Haircut haircut = haircutOptional.get();
            appointment.setHaircut(haircut); // ce n'est pas une liste donc possibilité d'utiliser un setter
            haircut.getAppointmentList().add(appointment); // on récupère la liste et on ajoute le nouvel élément
            return appointmentService.updateAppointment(idAppointments, appointment); // updateAppointment demande deux paramètre donc on passe l'id et appointment
        } else {
            return null;
        }
    }

}
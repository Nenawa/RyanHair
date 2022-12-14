package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Appointment;
import com.hair.ryan_hair_back.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Optional<Appointment> readOneAppointment(final Long id) {
        return appointmentRepository.findById(id);
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public Appointment updateAppointment(final Long id, Appointment appointment) {
        Appointment a = readOneAppointment(id).get();
        a.setId(id);
        a.setFirstName(appointment.getFirstName());
        a.setLastName(appointment.getFirstName());
        a.setTelephone(appointment.getTelephone());
        a.setEmail(appointment.getEmail());
        a.setComment(appointment.getComment());
        a.setHaircut(appointment.getHaircut());
        return appointmentRepository.save(a);
    }

    @Override
    public Iterable<Appointment> readAppointment() {
        return appointmentRepository.findAll();
    }
}

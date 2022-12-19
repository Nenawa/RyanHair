package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Appointment;

import java.util.Optional;

public interface AppointmentService {

    Optional<Appointment> readOneAppointment(final Long id);

    Appointment createAppointment(Appointment appointment);

    void deleteAppointment(final Long id);

    Appointment updateAppointment(final Long id, Appointment appointment);

    Iterable<Appointment> readAppointment();
}

package by.vasilenka.psychologist_appointment.repositories;

import by.vasilenka.psychologist_appointment.entities.PsychologistAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PsychologistAppointmentRepository extends JpaRepository<PsychologistAppointment, Long> {

}


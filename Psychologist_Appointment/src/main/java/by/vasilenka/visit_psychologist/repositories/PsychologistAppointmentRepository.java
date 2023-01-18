package by.vasilenka.visit_psychologist.repositories;

import by.vasilenka.visit_psychologist.entities.PsychologistAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PsychologistAppointmentRepository extends JpaRepository<PsychologistAppointment, Long> {

}


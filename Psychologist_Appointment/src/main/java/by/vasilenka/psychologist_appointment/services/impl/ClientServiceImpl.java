package by.vasilenka.psychologist_appointment.services.impl;

import by.vasilenka.psychologist_appointment.entities.PsychologistAppointment;
import by.vasilenka.psychologist_appointment.exceptions.PsychologistAppointmentNotFoundException;
import by.vasilenka.psychologist_appointment.repositories.PsychologistAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
* Contract implementation of ClientService
* */

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private PsychologistAppointmentRepository psychologistAppointmentRepository;

    @Override
    public List<PsychologistAppointment> getAllClients() {

        return psychologistAppointmentRepository.findAll();

    }

    @Override
    public PsychologistAppointment getClientById(long id) {

        return psychologistAppointmentRepository.findById(id).orElseThrow(()->
                new PsychologistAppointmentNotFoundException("Client with this ID number are not exist"));

    }

    @Override
    public long getCountOfAllClients() {

        return psychologistAppointmentRepository.count();

    }

    @Override
    public PsychologistAppointment updateClient(PsychologistAppointment client, long id) {

        Optional<PsychologistAppointment> clientToUpdate = psychologistAppointmentRepository.findById(id);

        if(clientToUpdate.isPresent()){

            clientToUpdate.get().setName(client.getName());
            clientToUpdate.get().setSurname(client.getSurname());
            clientToUpdate.get().setAge(client.getAge());
            clientToUpdate.get().setSex(client.getSex());
            clientToUpdate.get().setProblem(client.getProblem());
            clientToUpdate.get().setStatus(client.getStatus());

            return clientToUpdate.get();

        }

        throw new PsychologistAppointmentNotFoundException("Client with this ID number are not exist");

    }

    @Override
    public void saveClients(PsychologistAppointment visitPsychologist) {

        PsychologistAppointment currentVisitor = new PsychologistAppointment();

        currentVisitor.setName(visitPsychologist.getName());
        currentVisitor.setSurname(visitPsychologist.getSurname());
        currentVisitor.setAge(visitPsychologist.getAge());
        currentVisitor.setSex(visitPsychologist.getSex());
        currentVisitor.setProblem(visitPsychologist.getProblem());
        currentVisitor.setStatus(visitPsychologist.getStatus());

        psychologistAppointmentRepository.save(currentVisitor);

    }

    @Override
    public void deleteClient(long id) {

        psychologistAppointmentRepository.deleteById(id);

    }
}

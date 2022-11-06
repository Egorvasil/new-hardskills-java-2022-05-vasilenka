package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;
import by.vasilenka.visit_psychologist.exceptions.VisitPsychologistNotFoundException;
import by.vasilenka.visit_psychologist.repositories.VisitPsychologistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateClientServiceImpl implements UpdateClientService {

    @Autowired
    private VisitPsychologistRepository visitPsychologistRepository;

    @Override
    public VisitPsychologist updateClient(VisitPsychologist client, long id) {

        Optional<VisitPsychologist> visitorToUpdate = visitPsychologistRepository.findById(id);

        if(visitorToUpdate.isPresent()){

            visitorToUpdate.get().setName(client.getName());
            visitorToUpdate.get().setSurname(client.getSurname());
            visitorToUpdate.get().setAge(client.getAge());
            visitorToUpdate.get().setSex(client.getSex());
            visitorToUpdate.get().setProblem(client.getProblem());
            visitorToUpdate.get().setStatus(client.getStatus());

            return visitorToUpdate.get();

        }

        throw new VisitPsychologistNotFoundException("Client with this ID number are not exist");

    }
}

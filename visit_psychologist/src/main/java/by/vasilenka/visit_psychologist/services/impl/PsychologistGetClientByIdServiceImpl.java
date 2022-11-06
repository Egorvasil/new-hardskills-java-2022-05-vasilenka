package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;
import by.vasilenka.visit_psychologist.exceptions.VisitPsychologistNotFoundException;
import by.vasilenka.visit_psychologist.repositories.VisitPsychologistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychologistGetClientByIdServiceImpl implements PsychologistGetClientByIdService {

    @Autowired
    private VisitPsychologistRepository visitPsychologistRepository;

    @Override
    public VisitPsychologist getClientById(long id) {

        return visitPsychologistRepository.findById(id).orElseThrow(()->
                new VisitPsychologistNotFoundException("Client with this ID number are not exist"));

    }
}

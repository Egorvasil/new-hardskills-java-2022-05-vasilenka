package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;
import by.vasilenka.visit_psychologist.repositories.VisitPsychologistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsychologistGetAllClientsServiceImpl implements PsychologistGetAllClientsService {

    @Autowired
    private VisitPsychologistRepository visitPsychologistRepository;

    @Override
    public List<VisitPsychologist> getAllClients() {

        return visitPsychologistRepository.findAll();

    }
}

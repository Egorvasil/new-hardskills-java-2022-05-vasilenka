package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.repositories.VisitPsychologistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychologistGetCountOfAllClientsServiceImpl
        implements PsychologistGetCountOfAllClientsService {

    @Autowired
    private VisitPsychologistRepository visitPsychologistRepository;

    @Override
    public long getCountOfAllClients() {

        return visitPsychologistRepository.count();

    }
}

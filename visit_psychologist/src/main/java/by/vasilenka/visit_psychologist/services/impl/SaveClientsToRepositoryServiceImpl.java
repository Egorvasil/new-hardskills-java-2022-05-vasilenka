package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;
import by.vasilenka.visit_psychologist.repositories.VisitPsychologistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveClientsToRepositoryServiceImpl implements SaveClientsToRepositoryService {

    @Autowired
    private VisitPsychologistRepository visitPsychologistRepository;

    @Override
    public void saveClients(VisitPsychologist visitPsychologist) {

        VisitPsychologist currentVisitor = new VisitPsychologist();

        currentVisitor.setName(visitPsychologist.getName());
        currentVisitor.setSurname(visitPsychologist.getSurname());
        currentVisitor.setAge(visitPsychologist.getAge());
        currentVisitor.setSex(visitPsychologist.getSex());
        currentVisitor.setProblem(visitPsychologist.getProblem());
        currentVisitor.setStatus(visitPsychologist.getStatus());

        visitPsychologistRepository.save(currentVisitor);

    }
}

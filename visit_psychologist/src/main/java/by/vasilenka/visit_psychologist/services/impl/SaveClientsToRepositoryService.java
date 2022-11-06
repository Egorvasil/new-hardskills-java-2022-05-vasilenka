package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;

/**
 * API for saves all data of clients to database
 */
public interface SaveClientsToRepositoryService {

    void saveClients(VisitPsychologist visitPsychologist);

}

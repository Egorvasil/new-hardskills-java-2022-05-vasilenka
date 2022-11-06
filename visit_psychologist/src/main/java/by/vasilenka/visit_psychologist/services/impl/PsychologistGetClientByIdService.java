package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;

/**
 *  API for showing clients data to Psychologist by ID
 *  before consultation
 */
public interface PsychologistGetClientByIdService {

    /**
     * @param id is ID of client
     * */

    VisitPsychologist getClientById(long id);

}

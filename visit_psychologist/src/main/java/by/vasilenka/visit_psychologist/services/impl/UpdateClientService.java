package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;

/**
 *  API for updating clients data
 */
public interface UpdateClientService {

    /**
     * @param client includes all data of client
     * @param id is ID of want to be updating client
     * */

    VisitPsychologist updateClient(VisitPsychologist client, long id);

}

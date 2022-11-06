package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;
import java.util.List;

/**
 *  API for showing Psychologist all clients
 *  and their data before consultation
 */
public interface PsychologistGetAllClientsService {

    /*
     * @param List <VisitPsychologist> contains all clients and their data
     * */

    List<VisitPsychologist> getAllClients();

}

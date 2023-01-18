package by.vasilenka.visit_psychologist.services.impl;

import by.vasilenka.visit_psychologist.entities.PsychologistAppointment;
import java.util.List;

/**
 *  This API show all clients
 *  or individually each (by ID) with their data before consultation.
 *  Also: count all clients,
 *  saves all data of clients to database,
 *  remove client appointment (by ID),
 *  update clients data (by ID)
 */

public interface ClientService {

    /**
    * This method returns all clients
    * */

    List<PsychologistAppointment> getAllClients();

    /**
     * This method returns one client by id
     * @param id is ID of client
     * */

    PsychologistAppointment getClientById(long id);

    /**
    * This method returns the number of clients
    * */
    long getCountOfAllClients();

    /**
     * This method for updating clients data
     * @param client includes all data of client
     * @param id is ID of want to be updating client
     * */

    PsychologistAppointment updateClient(PsychologistAppointment client, long id);

    /**
    * This method saves the client to the database
    * */

    void saveClients(PsychologistAppointment psychologistAppointment);

    /**
     * This method removes clients by id
     * @param id is ID of deleted client
     * */

    void deleteClient(long id);

}

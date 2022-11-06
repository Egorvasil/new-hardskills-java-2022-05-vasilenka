package by.vasilenka.visit_psychologist.rest;

import by.vasilenka.visit_psychologist.entities.VisitPsychologist;
import by.vasilenka.visit_psychologist.services.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * GET request for URL localhost:8080/visit_psychologist
 * This web - app for clients who want to get an appointment with a psychologist
 * And for a psychologist who wants to see the number of clients and their data
 *
 * Client can: 1) Make an appointment with a psychologist by writing down his/her own data
 *             2) Update the data
 *             3) Delete data if the client changes his/her mind
 *
 * Psychologist can: 1) View data of all clients
 *                   2) View individual client data
 *                   3) See the number of clients
 */

@RestController
@RequestMapping("/visit_psychologist")
public class VisitPsychologistController {

    @Autowired
    private PsychologistGetAllClientsService psychologistGetAllClientsService;
    @Autowired
    private PsychologistGetClientByIdService psychologistGetClientByIdService;
    @Autowired
    private SaveClientsToRepositoryService saveClientsToRepositoryService;
    @Autowired
    private PsychologistGetCountOfAllClientsService psychologistGetCountOfAllClientsService;
    @Autowired
    private UpdateClientService updateClient;
    @Autowired
    private DeleteClientService deleteClientService;

    @GetMapping // GET http://localhost:8080/visit_psychologist URI (URL + URN)
    public ResponseEntity<List<VisitPsychologist>> getAllClients(){

        return new ResponseEntity<>(psychologistGetAllClientsService.getAllClients(), HttpStatus.OK);

    }

    @GetMapping("/{id}") // GET http://localhost:8080/visit_psychologist/{id} URI (URL + URN)
    public ResponseEntity<VisitPsychologist> getClientById(@PathVariable(name = "id") Long id){

        return new ResponseEntity<>(psychologistGetClientByIdService.getClientById(id), HttpStatus.OK);

    }

    @PostMapping // POST http://localhost:8080/visit_psychologist URI (URL + URN)
    public ResponseEntity<VisitPsychologist> createClient(@RequestBody VisitPsychologist visitPsychologist){

        saveClientsToRepositoryService.saveClients(visitPsychologist);

        return new ResponseEntity<>(visitPsychologist, HttpStatus.CREATED);

    }

    @GetMapping("/count") // GET http://localhost:8080/visit_psychologist/count
    public ResponseEntity<Long> getCountOfAllClients(){

        return new ResponseEntity<>(psychologistGetCountOfAllClientsService.getCountOfAllClients(), HttpStatus.OK);

    }

    @PutMapping("{id}/update") // PUT http://localhost:8080/visit_psychologist/{id}/update
    public ResponseEntity<VisitPsychologist> updateClient(@RequestBody VisitPsychologist visitPsychologist,
                                                           @PathVariable(name = "id") Long id){

        return new ResponseEntity<>(updateClient.updateClient(visitPsychologist, id), HttpStatus.OK);

    }

    @DeleteMapping("{id}/delete") // DELETE http://localhost:8080/visit_psychologist/{id}/delete
    public ResponseEntity<Void> deleteClient(@PathVariable(name = "id") Long id){

        deleteClientService.deleteClient(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}

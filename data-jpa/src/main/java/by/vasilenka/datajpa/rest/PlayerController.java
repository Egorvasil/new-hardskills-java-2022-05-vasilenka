package by.vasilenka.datajpa.rest;

import by.vasilenka.datajpa.domain.entities.Player;
import by.vasilenka.datajpa.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping // GET http://localhost:8080/player URI (URL + URN)
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK); // 200 OK
    }

    @GetMapping("/{id}") // GET http://localhost:8080/player/{id} URI (URL + URN)
    public ResponseEntity<Player> getPlayerById(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(playerService.getPlayerById(id), HttpStatus.OK); // 200 OK

    }

    @PostMapping // POST http://localhost:8080/player URI (URL + URN)
    public ResponseEntity<Player> createPlayer(@RequestBody Player player){
        playerService.savePlayer(player); // save
        return new ResponseEntity<>(player, HttpStatus.CREATED); // 201 CREATED
    }

    @GetMapping("/count") // GET http://localhost:8080/player/count
    public ResponseEntity<Long> getCountOfAllPlayers(){
        return new ResponseEntity<>(playerService.getCountOfAllPlayers(), HttpStatus.OK); // 200 OK
    }

    @PutMapping("{id}/update") // PUT http://localhost:8080/player/{id}/update
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player,
                                               @PathVariable(name = "id") Long id){
        return new ResponseEntity<>(playerService.updatePlayer(player, id), HttpStatus.OK); // 200 OK
    }

    @DeleteMapping("{id}/delete") // DELETE http://localhost:8080/player/{id}/delete
    public ResponseEntity<Void> deletePlayer(@PathVariable(name = "id") Long id){
        playerService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.OK); // 200 OK
    }

}

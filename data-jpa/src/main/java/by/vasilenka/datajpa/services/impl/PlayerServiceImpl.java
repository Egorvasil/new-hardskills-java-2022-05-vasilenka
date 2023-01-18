package by.vasilenka.datajpa.services.impl;

import by.vasilenka.datajpa.domain.entities.Player;
import by.vasilenka.datajpa.exceptions.PlayerNotFoundException;
import by.vasilenka.datajpa.repositories.PlayerRepository;
import by.vasilenka.datajpa.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public long getCountOfAllPlayers() {
        return playerRepository.count();
    }

    @Override
    public void savePlayer(Player player) {
        Player currentPlayer = new Player();
        currentPlayer.setName(player.getName()); //init field name
        currentPlayer.setPoints(player.getPoints()); // init field points
        playerRepository.save(currentPlayer);

    }

    @Override
    public  Player getPlayerById(long id) {
        return playerRepository.findById(id).orElseThrow(()->
                new PlayerNotFoundException(id));
    }

    @Override
    public Player updatePlayer(Player player, long id) {
        Optional<Player> playerToUpdate =playerRepository.findById(id);
        if(playerToUpdate.isPresent()){
            playerToUpdate.get().setName(player.getName());
            playerToUpdate.get().setPoints(player.getPoints());
            playerRepository.save(playerToUpdate.get());
            return playerToUpdate.get();
        }
        throw new PlayerNotFoundException(id);
    }

    @Override
    public void deletePlayer(long id) {
        playerRepository.deleteById(id);
    }


}

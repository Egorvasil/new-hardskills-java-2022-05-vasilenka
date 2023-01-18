package by.vasilenka.datajpa.services;


import by.vasilenka.datajpa.domain.entities.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    long getCountOfAllPlayers();

    void savePlayer(Player player);

    Player getPlayerById(long id);

    Player updatePlayer(Player player, long id);

    void deletePlayer(long id);


}

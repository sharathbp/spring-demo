package com.example.takehomedemo.service;

import com.example.takehomedemo.entities.Player;

import java.io.InputStream;
import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    Player getPlayerById(long id);

    List<Player> initializeDatabase(InputStream inputStream);
}

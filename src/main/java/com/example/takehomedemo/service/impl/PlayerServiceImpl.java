package com.example.takehomedemo.service.impl;

import com.example.takehomedemo.converter.PlayerConverter;
import com.example.takehomedemo.entities.Player;
import com.example.takehomedemo.model.PlayerModel;
import com.example.takehomedemo.repository.PlayerRepo;
import com.example.takehomedemo.service.PlayerService;
import com.example.takehomedemo.utils.CsvParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepo playerRepository;

    @Autowired
    public PlayerServiceImpl(final PlayerRepo playerRepository) {
        this.playerRepository = playerRepository;
    }
    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayerById(long id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Player> initializeDatabase(InputStream inputStream) {
        PlayerConverter playerConverter = new PlayerConverter();

        CsvParserUtils csvParserUtils = new CsvParserUtils();
        List<PlayerModel> playerModelList = csvParserUtils.parseCsv(inputStream);
        List<Player> players = playerModelList.parallelStream()
                .map(playerModel -> playerConverter.convert(playerModel))
                .collect(Collectors.toList());
        playerRepository.saveAll(players);
        return players;
    }




}

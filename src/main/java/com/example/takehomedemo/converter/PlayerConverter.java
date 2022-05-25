package com.example.takehomedemo.converter;


import com.example.takehomedemo.entities.Player;
import com.example.takehomedemo.model.PlayerModel;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;


public class PlayerConverter {
    JMapper playerModelToPlayerMapper;

    public PlayerConverter() {
        JMapperAPI playerModelToPlayerApi = new JMapperAPI().add(JMapperAPI.mappedClass(Player.class));
        playerModelToPlayerMapper = new JMapper(Player.class, PlayerModel.class, playerModelToPlayerApi);
    }

    public Player convert(PlayerModel playerModel) {
        return (Player) playerModelToPlayerMapper.getDestination(playerModel);
    }
}

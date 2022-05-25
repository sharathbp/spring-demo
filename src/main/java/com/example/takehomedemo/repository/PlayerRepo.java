package com.example.takehomedemo.repository;

import com.example.takehomedemo.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {

}


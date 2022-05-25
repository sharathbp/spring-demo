package com.example.takehomedemo.controller;

import com.example.takehomedemo.entities.Player;
import com.example.takehomedemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/api/players")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // build get all employees REST API
    @GetMapping
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    // build get employee by id REST API
    // http://localhost:8080/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<Player> getEmployeeById(@PathVariable("id") long employeeId){
        return new ResponseEntity<Player>(playerService.getPlayerById(employeeId), HttpStatus.OK);
    }

    @PostMapping("/upload")
    public List<Player> uploadData(@RequestParam("file") MultipartFile file) throws Exception {
        return playerService.initializeDatabase(file.getInputStream());
    }
}

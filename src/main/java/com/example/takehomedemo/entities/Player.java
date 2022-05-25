package com.example.takehomedemo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Player")
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "playerId")
    private String playerId;
    @Column(name = "birthYear")
    private String birthYear;
    @Column(name = "birthMonth")
    private String birthMonth;
    @Column(name = "birthDay")
    private String birthDay;
    @Column(name = "birthCountry")
    private String birthCountry;
    @Column(name = "birthState")
    private String birthState;
    @Column(name = "birthCity")
    private String birthCity;
    @Column(name = "deathYear")
    private String deathYear;
    @Column(name = "deathMonth")
    private String deathMonth;

    public Player() {

    }

    public Player(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(String deathMonth) {
        this.deathMonth = deathMonth;
    }
}

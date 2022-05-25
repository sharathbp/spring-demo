package com.example.takehomedemo.model;

import com.googlecode.jmapper.annotations.JMap;
import com.univocity.parsers.annotations.Parsed;

public class PlayerModel {
    @JMap(value = "playerId")
    @Parsed(field = "playerID")
    private String id;
    @JMap
    @Parsed
    private String birthYear;
    @JMap
    @Parsed
    private String birthMonth;
    @JMap
    @Parsed
    private String birthDay;
    @JMap
    @Parsed
    private String birthCountry;
    @JMap
    @Parsed
    private String birthState;
    @JMap
    @Parsed
    private String birthCity;
    @JMap
    @Parsed
    private String deathYear;
    @JMap
    @Parsed
    private String deathMonth;

    public PlayerModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

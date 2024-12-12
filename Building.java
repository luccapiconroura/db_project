package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Building {
    @Id
    private Integer bldNumber;
    private Double value;
    private Integer floors;
    private String nickname;
    private Integer constructionYear;

    // Getters and Setters
    public Integer getBldNumber() { return bldNumber; }
    public void setBldNumber(Integer bldNumber) { this.bldNumber = bldNumber; }
    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }
    public Integer getFloors() { return floors; }
    public void setFloors(Integer floors) { this.floors = floors; }
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public Integer getConstructionYear() { return constructionYear; }
    public void setConstructionYear(Integer constructionYear) { this.constructionYear = constructionYear; }
}

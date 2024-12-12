package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class FloorPlan {
    @Id
    private String letter;

    private Integer bedrooms;
    private Integer bathrooms;
    private Integer squareFeet;
    private Double basePrice;

    // Getters and Setters
    public String getLetter() { return letter; }
    public void setLetter(String letter) { this.letter = letter; }
    public Integer getBedrooms() { return bedrooms; }
    public void setBedrooms(Integer bedrooms) { this.bedrooms = bedrooms; }
    public Integer getBathrooms() { return bathrooms; }
    public void setBathrooms(Integer bathrooms) { this.bathrooms = bathrooms; }
    public Integer getSquareFeet() { return squareFeet; }
    public void setSquareFeet(Integer squareFeet) { this.squareFeet = squareFeet; }
    public Double getBasePrice() { return basePrice; }
    public void setBasePrice(Double basePrice) { this.basePrice = basePrice; }
}

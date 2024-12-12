package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@IdClass(ApartmentId.class)
public class Apartment {
    @Id
    private Integer bldNumber;

    @Id
    private String aptLetter;

    private Integer bedrooms;
    private String directionFacing;
    private Integer floorNumber;
    private String specialFeatures;

    // Default Constructor
    public Apartment() {
    }

    // Getters and Setters
    public Integer getBldNumber() {
        return bldNumber;
    }

    public void setBldNumber(Integer bldNumber) {
        this.bldNumber = bldNumber;
    }

    public String getAptLetter() {
        return aptLetter;
    }

    public void setAptLetter(String aptLetter) {
        this.aptLetter = aptLetter;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getDirectionFacing() {
        return directionFacing;
    }

    public void setDirectionFacing(String directionFacing) {
        this.directionFacing = directionFacing;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getSpecialFeatures () {
        return specialFeatures;
    }

    public void setSpecialFeatures (String specialFeatures){
        this.specialFeatures = specialFeatures;
    }
}

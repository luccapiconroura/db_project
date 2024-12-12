package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ApartmentId implements Serializable {
    private Integer bldNumber;
    private String aptLetter;

    // Default Constructor
    public ApartmentId() {
    }

    // Parameterized Constructor
    public ApartmentId(Integer bldNumber, String aptLetter) {
        this.bldNumber = bldNumber;
        this.aptLetter = aptLetter;
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

    // Override equals() and hashCode() for composite keys
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApartmentId that = (ApartmentId) o;
        return Objects.equals(bldNumber, that.bldNumber) &&
                Objects.equals(aptLetter, that.aptLetter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bldNumber, aptLetter);
    }
}

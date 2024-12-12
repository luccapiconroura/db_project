package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Inspection") // Not strictly required if class name matches table name, but good practice
public class Inspection {

    @Id
    @Column(name = "ID_Number", nullable = false)
    private Integer idNumber; // Matches DB primary key

    @Column(name = "Date")
    private LocalDate date;

    @Column(name = "Comment", columnDefinition = "TEXT")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "Bld_Number") // Foreign key to Building
    private Building building;

    @Column(name = "Result")
    private String result;

    @Column(name = "Inspector_First_Name")
    private String inspectorFirstName;

    @Column(name = "Inspector_Last_Name")
    private String inspectorLastName;

    // Getters and Setters
    public Integer getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Building getBuilding() { return building; }
    public void setBuilding(Building building) { this.building = building; }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }

    public String getInspectorFirstName() { return inspectorFirstName; }
    public void setInspectorFirstName(String inspectorFirstName) { this.inspectorFirstName = inspectorFirstName; }

    public String getInspectorLastName() { return inspectorLastName; }
    public void setInspectorLastName(String inspectorLastName) { this.inspectorLastName = inspectorLastName; }
}

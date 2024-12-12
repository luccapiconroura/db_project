package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Lease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer leaseId;

    @Column(name = "tenant_id", nullable = false)
    private Integer tenantId;

    @Column(name = "bld_number", nullable = false)
    private Integer bldNumber;

    @Column(name = "apt_number", nullable = false)
    private String aptLetter;

    private LocalDate startDate;
    private LocalDate endDate;
    private Double monthlyRent;

    // Getters and Setters
    public Integer getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(Integer leaseId) {
        this.leaseId = leaseId;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}

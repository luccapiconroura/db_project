package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Tenant_References")
@IdClass(TenantReferenceId.class)
public class TenantReference {
    @Id
    @Column(name = "tenant_id", nullable = false)
    private Integer tenantId;

    @Id
    @Column(name = "reference_name", nullable = false)
    private String referenceName;

    // Getters and Setters
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }
}

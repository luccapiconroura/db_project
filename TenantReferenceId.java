package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

public class TenantReferenceId implements Serializable {
    private Integer tenantId;
    private String referenceName;

    public TenantReferenceId() {}

    public TenantReferenceId(Integer tenantId, String referenceName) {
        this.tenantId = tenantId;
        this.referenceName = referenceName;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public String getReferenceName() {
        return referenceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TenantReferenceId)) return false;
        TenantReferenceId that = (TenantReferenceId) o;
        return Objects.equals(tenantId, that.tenantId) &&
               Objects.equals(referenceName, that.referenceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, referenceName);
    }
}

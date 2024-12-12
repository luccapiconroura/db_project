package com.example.demo.repository;

import com.example.demo.entity.TenantReference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantReferenceRepository extends JpaRepository<TenantReference, Integer> {
}

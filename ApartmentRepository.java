package com.example.demo.repository;

import com.example.demo.entity.Apartment;
import com.example.demo.entity.ApartmentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, ApartmentId> {
}

package com.example.demo.repository;

import com.example.demo.entity.Lease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepository extends JpaRepository<Lease, Integer> {
}

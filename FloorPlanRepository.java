package com.example.demo.repository;

import com.example.demo.entity.FloorPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FloorPlanRepository extends JpaRepository<FloorPlan, Integer> {
}

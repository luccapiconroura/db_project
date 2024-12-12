package com.example.demo.controller;

import com.example.demo.entity.FloorPlan;
import com.example.demo.repository.FloorPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/floor-plans")
public class FloorPlanController {

    @Autowired
    private FloorPlanRepository floorPlanRepository;

    @GetMapping
    public List<FloorPlan> getAllFloorPlans() {
        return floorPlanRepository.findAll();
    }

    @PostMapping
    public FloorPlan addFloorPlan(@RequestBody FloorPlan floorPlan) {
        return floorPlanRepository.save(floorPlan);
    }

    @PutMapping("/{letter}")
    public FloorPlan updateFloorPlan(@PathVariable int letter, @RequestBody FloorPlan updatedFloorPlan) {
        return floorPlanRepository.findById(letter).map(floorPlan -> {
            floorPlan.setBedrooms(updatedFloorPlan.getBedrooms());
            floorPlan.setBathrooms(updatedFloorPlan.getBathrooms());
            floorPlan.setSquareFeet(updatedFloorPlan.getSquareFeet());
            floorPlan.setBasePrice(updatedFloorPlan.getBasePrice());
            return floorPlanRepository.save(floorPlan);
        }).orElseThrow(() -> new RuntimeException("FloorPlan not found with letter " + letter));
    }

    @DeleteMapping("/{letter}")
    public String deleteFloorPlan(@PathVariable int letter) {
        floorPlanRepository.deleteById(letter);
        return "FloorPlan deleted successfully!";
    }
}

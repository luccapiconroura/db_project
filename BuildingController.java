package com.example.demo.controller;

import com.example.demo.entity.Building;
import com.example.demo.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepository;

    @GetMapping
    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

    @PostMapping
    public Building addBuilding(@RequestBody Building building) {
        return buildingRepository.save(building);
    }

    @PutMapping("/{bldNumber}")
    public Building updateBuilding(@PathVariable Integer bldNumber, @RequestBody Building updatedBuilding) {
        return buildingRepository.findById(bldNumber).map(building -> {
            building.setNickname(updatedBuilding.getNickname());
            building.setFloors(updatedBuilding.getFloors());
            return buildingRepository.save(building);
        }).orElseThrow(() -> new RuntimeException("Building not found with id " + bldNumber));
    }

    @DeleteMapping("/{bldNumber}")
    public String deleteBuilding(@PathVariable Integer bldNumber) {
        buildingRepository.deleteById(bldNumber);
        return "Building deleted successfully!";
    }

}

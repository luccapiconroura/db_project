package com.example.demo.controller;

import com.example.demo.entity.Inspection;
import com.example.demo.repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inspections")
public class InspectionController {

    @Autowired
    private InspectionRepository inspectionRepository;

    @GetMapping
    public List<Inspection> getAllInspections() {
        return inspectionRepository.findAll();
    }

    @PostMapping
    public Inspection addInspection(@RequestBody Inspection inspection) {
        return inspectionRepository.save(inspection);
    }

    @PutMapping("/{id}")
    public Inspection updateInspection(@PathVariable Integer id, @RequestBody Inspection updatedInspection) {
        return inspectionRepository.findById(id).map(inspection -> {
            inspection.setDate(updatedInspection.getDate());
            inspection.setComment(updatedInspection.getComment());
            inspection.setBuilding(updatedInspection.getBuilding());
            inspection.setResult(updatedInspection.getResult());
            inspection.setInspectorFirstName(updatedInspection.getInspectorFirstName());
            inspection.setInspectorLastName(updatedInspection.getInspectorLastName());
            return inspectionRepository.save(inspection);
        }).orElseThrow(() -> new RuntimeException("Inspection not found with id " + id));
    }

    @DeleteMapping("/{id}")
    public String deleteInspection(@PathVariable Integer id) {
        inspectionRepository.deleteById(id);
        return "Inspection deleted successfully!";
    }
}

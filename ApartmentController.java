package com.example.demo.controller;

import com.example.demo.entity.Apartment;
import com.example.demo.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    // GET all apartments
    @GetMapping
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    // GET a specific apartment (by composite key)
    @GetMapping("/{bldNumber}/{aptLetter}")
    public Apartment getApartmentById(
        @PathVariable Integer bldNumber,
        @PathVariable String aptLetter) {
        return apartmentService.getApartmentById(bldNumber, aptLetter);
    }

    // POST a new apartment
    @PostMapping
    public Apartment createApartment(@RequestBody Apartment apartment) {
        return apartmentService.saveApartment(apartment);
    }

    // DELETE an apartment
    @DeleteMapping("/{bldNumber}/{aptLetter}")
    public void deleteApartment(
        @PathVariable Integer bldNumber,
        @PathVariable String aptLetter) {
        apartmentService.deleteApartment(bldNumber, aptLetter);
    }
}

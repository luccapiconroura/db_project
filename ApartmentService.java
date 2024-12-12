package com.example.demo.service;

import com.example.demo.entity.Apartment;
import com.example.demo.entity.ApartmentId;
import com.example.demo.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    public Apartment getApartmentById(Integer bldNumber, String aptLetter) {
        return apartmentRepository.findById(new ApartmentId(bldNumber, aptLetter)).orElse(null);
    }

    public Apartment saveApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public void deleteApartment(Integer bldNumber, String aptLetter) {
        apartmentRepository.deleteById(new ApartmentId(bldNumber, aptLetter));
    }
}

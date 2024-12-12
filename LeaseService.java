package com.example.demo.service;

import com.example.demo.entity.Lease;
import com.example.demo.repository.LeaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaseService {
    @Autowired
    private LeaseRepository leaseRepository;

    public List<Lease> getAllLeases() {
        return leaseRepository.findAll();
    }

    public Lease getLeaseById(Integer id) {
        return leaseRepository.findById(id).orElse(null);
    }

    public Lease saveLease(Lease lease) {
        return leaseRepository.save(lease);
    }

    public void deleteLease(Integer id) {
        leaseRepository.deleteById(id);
    }
}

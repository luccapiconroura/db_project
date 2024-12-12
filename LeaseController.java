package com.example.demo.controller;

import com.example.demo.entity.Lease;
import com.example.demo.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leases")
public class LeaseController {
    @Autowired
    private LeaseService leaseService;

    @GetMapping
    public List<Lease> getAllLeases() {
        return leaseService.getAllLeases();
    }

    @GetMapping("/{id}")
    public Lease getLeaseById(@PathVariable Integer id) {
        return leaseService.getLeaseById(id);
    }

    @PostMapping
    public Lease saveLease(@RequestBody Lease lease) {
        return leaseService.saveLease(lease);
    }

    @DeleteMapping("/{id}")
    public void deleteLease(@PathVariable Integer id) {
        leaseService.deleteLease(id);
    }
}

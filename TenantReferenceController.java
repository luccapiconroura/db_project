package com.example.demo.controller;

import com.example.demo.entity.TenantReference;
import com.example.demo.repository.TenantReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenant-references")
public class TenantReferenceController {

    @Autowired
    private TenantReferenceRepository tenantReferenceRepository;

    @GetMapping
    public List<TenantReference> getAllTenantReferences() {
        return tenantReferenceRepository.findAll();
    }

    @PostMapping
    public TenantReference addTenantReference(@RequestBody TenantReference tenantReference) {
        return tenantReferenceRepository.save(tenantReference);
    }

    @PutMapping("/{id}")
    public TenantReference updateTenantReference(@PathVariable Integer id, @RequestBody TenantReference updatedReference) {
        return tenantReferenceRepository.findById(id).map(reference -> {
            reference.setReferenceName(updatedReference.getReferenceName());
            reference.setTenantId(updatedReference.getTenantId()); // Use tenantId field directly
            return tenantReferenceRepository.save(reference);
        }).orElseThrow(() -> new RuntimeException("TenantReference not found with id " + id));
    }

    @DeleteMapping("/{id}")
    public String deleteTenantReference(@PathVariable Integer id) {
        tenantReferenceRepository.deleteById(id);
        return "TenantReference deleted successfully!";
    }
}

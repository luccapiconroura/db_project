package com.example.demo.controller;

import com.example.demo.entity.Tenant;
import com.example.demo.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenants")
public class TenantController {

    @Autowired
    private TenantRepository tenantRepository;

    @GetMapping
    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }

    @PostMapping
    public Tenant addTenant(@RequestBody Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @PutMapping("/{tenantId}")
    public Tenant updateTenant(@PathVariable Integer tenantId, @RequestBody Tenant updatedTenant) {
        return tenantRepository.findById(tenantId).map(tenant -> {
            tenant.setFirstName(updatedTenant.getFirstName());
            tenant.setLastName(updatedTenant.getLastName());
            tenant.setCreditScore(updatedTenant.getCreditScore());
            return tenantRepository.save(tenant);
        }).orElseThrow(() -> new RuntimeException("Tenant not found with id " + tenantId));
    }

    @DeleteMapping("/{tenantId}")
    public String deleteTenant(@PathVariable Integer tenantId) {
        tenantRepository.deleteById(tenantId);
        return "Tenant deleted successfully!";
    }

}

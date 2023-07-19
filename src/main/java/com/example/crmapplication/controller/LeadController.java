package com.example.crmapplication.controller;
import com.example.crmapplication.entity.Lead;
import com.example.crmapplication.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/leads")
public class LeadController {
    private final LeadService leadService;

    @Autowired
    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }

    @GetMapping("/{id}")
    public Optional<Lead> getLeadById(@PathVariable Long id) {
        return leadService.getLeadById(id);
    }

    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }

    @PutMapping("/{id}")
    public Lead updateLead(@PathVariable Long id, @RequestBody Lead lead) {
        return leadService.updateLead(id, lead);
    }

    @DeleteMapping("/{id}")
    public void deleteLead(@PathVariable Long id) {
        leadService.deleteLead(id);
    }
}

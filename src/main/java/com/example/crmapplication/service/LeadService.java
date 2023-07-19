package com.example.crmapplication.service;
import com.example.crmapplication.entity.Lead;
import  com.example.crmapplication.repository.LeadRepository;
import com.example.crmapplication.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadService {
    private final LeadRepository leadRepository;

    @Autowired
    public LeadService(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Optional<Lead> getLeadById(Long id) {
        return leadRepository.findById(id);
    }

    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public Lead updateLead(Long id, Lead lead) {
        Optional<Lead> existingLead = leadRepository.findById(id);
        if (existingLead.isPresent()) {
            lead.setId(id);
            return leadRepository.save(lead);
        }
        return null; // or throw an exception indicating the lead was not found
    }

    public void deleteLead(Long id) {
        leadRepository.deleteById(id);
    }
}

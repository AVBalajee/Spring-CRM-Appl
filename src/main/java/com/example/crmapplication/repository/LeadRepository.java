package com.example.crmapplication.repository;
import com.example.crmapplication.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}

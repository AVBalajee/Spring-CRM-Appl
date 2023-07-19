package com.example.crmapplication.repository;
import com.example.crmapplication.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}


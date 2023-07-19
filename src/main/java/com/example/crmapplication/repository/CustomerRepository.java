package com.example.crmapplication.repository;
import com.example.crmapplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}

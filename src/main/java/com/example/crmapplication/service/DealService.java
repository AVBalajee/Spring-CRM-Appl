package com.example.crmapplication.service;
import com.example.crmapplication.entity.Deal;
import com.example.crmapplication.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealService {
    private final DealRepository dealRepository;

    @Autowired
    public DealService(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    public List<Deal> getAllDeals() {
        return dealRepository.findAll();
    }

    public Optional<Deal> getDealById(Long id) {
        return dealRepository.findById(id);
    }

    public Deal createDeal(Deal deal) {
        return dealRepository.save(deal);
    }

    public Deal updateDeal(Long id, Deal deal) {
        Optional<Deal> existingDeal = dealRepository.findById(id);
        if (existingDeal.isPresent()) {
            deal.setId(id);
            return dealRepository.save(deal);
        }
        return null; // or throw an exception indicating the deal was not found
    }

    public void deleteDeal(Long id) {
        dealRepository.deleteById(id);
    }
}

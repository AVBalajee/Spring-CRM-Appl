package com.example.crmapplication.controller;
import com.example.crmapplication.entity.Deal;
import com.example.crmapplication.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deals")
public class DealController {
    private final DealService dealService;

    @Autowired
    public DealController(DealService dealService) {
        this.dealService = dealService;
    }

    @GetMapping
    public List<Deal> getAllDeals() {
        return dealService.getAllDeals();
    }

    @GetMapping("/{id}")
    public Optional<Deal> getDealById(@PathVariable Long id) {
        return dealService.getDealById(id);
    }

    @PostMapping
    public Deal createDeal(@RequestBody Deal deal) {
        return dealService.createDeal(deal);
    }

    @PutMapping("/{id}")
    public Deal updateDeal(@PathVariable Long id, @RequestBody Deal deal) {
        return dealService.updateDeal(id, deal);
    }

    @DeleteMapping("/{id}")
    public void deleteDeal(@PathVariable Long id) {
        dealService.deleteDeal(id);
    }
}

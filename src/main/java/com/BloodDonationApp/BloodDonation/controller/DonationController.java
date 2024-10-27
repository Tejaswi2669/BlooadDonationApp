package com.BloodDonationApp.BloodDonation.controller;




import com.BloodDonationApp.BloodDonation.Entity.Donation;
import com.BloodDonationApp.BloodDonation.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {

    @Autowired
    private DonationService donationService;

    @GetMapping("/donor/{donorId}")
    public ResponseEntity<List<Donation>> getDonationsByDonorId(@PathVariable Long donorId) {
        List<Donation> donations = donationService.getDonationsByDonorId(donorId);
        return ResponseEntity.ok(donations);
    }

    @PostMapping
    public ResponseEntity<?> createDonation(@RequestBody Donation donation) {
        donationService.createDonation(donation);
        return ResponseEntity.ok("Donation created successfully");
    }

    @GetMapping
    public ResponseEntity<List<Donation>> getAllDonations() {
        List<Donation> donations = donationService.getAllDonations();
        return ResponseEntity.ok(donations);
    }

}

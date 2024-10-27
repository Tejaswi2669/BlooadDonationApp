package com.BloodDonationApp.BloodDonation.service;


import com.BloodDonationApp.BloodDonation.Entity.Donation;
import com.BloodDonationApp.BloodDonation.Repository.DonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {
    @Autowired
    private DonationRepo donationRepository;

    public List<Donation> getDonationsByDonorId(Long donorId) {
        return donationRepository.findByDonorId(donorId);
    }

    public Donation createDonation(Donation donation) {
        return donationRepository.save(donation);
    }
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }
}

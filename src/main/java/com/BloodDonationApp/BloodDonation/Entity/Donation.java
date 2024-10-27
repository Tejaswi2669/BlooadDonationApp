package com.BloodDonationApp.BloodDonation.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "donor_id")
    private User donor;

    private LocalDate donationDate;
}

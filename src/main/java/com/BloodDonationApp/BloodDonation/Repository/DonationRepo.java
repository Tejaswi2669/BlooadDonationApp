package com.BloodDonationApp.BloodDonation.Repository;

import com.BloodDonationApp.BloodDonation.Entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DonationRepo  extends JpaRepository<Donation, Long> {
    List<Donation> findByDonorId(Long donorId);
}
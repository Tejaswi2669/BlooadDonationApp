package com.BloodDonationApp.BloodDonation.service;


import com.BloodDonationApp.BloodDonation.Entity.User;
import com.BloodDonationApp.BloodDonation.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public User registerUser(User user) {
        // Encrypt password, set role, and save user
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> getAllDonors() {
        return userRepository.findAll().stream()
                .filter(user -> "DONOR".equals(user.getRole()))
                .toList();
    }
}
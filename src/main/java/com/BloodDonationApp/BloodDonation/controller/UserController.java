package com.BloodDonationApp.BloodDonation.controller;



import com.BloodDonationApp.BloodDonation.Entity.User;
import com.BloodDonationApp.BloodDonation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        // Implement logic for authentication here
        return ResponseEntity.ok("User logged in successfully");
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> findByEmail(@PathVariable String email) {
        User user = userService.findByEmail(email);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/donors")
    public ResponseEntity<List<User>> getAllDonors() {
        List<User> donors = userService.getAllDonors();
        return ResponseEntity.ok(donors);
    }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User registerUser(User user) throws Exception {
        if (userRepo.existsByEmail(user.getEmail())) {
            throw new Exception("Email already registered");
        }
        return userRepo.save(user);
    }

    public User login(String email, String password) throws Exception {
        Optional<User> userOptional = userRepo.findByEmail(email);
        if (userOptional.isPresent() && userOptional.get().getPassword().equals(password)) {
            return userOptional.get();
        }
        throw new Exception("Invalid email or password");
    }
}
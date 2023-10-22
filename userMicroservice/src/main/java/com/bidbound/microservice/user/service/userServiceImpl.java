package com.bidbound.microservice.user.service;

import com.bidbound.microservice.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements IuserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User userDetails) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            // Update the user details
            existingUser.setNom(userDetails.getNom());
            existingUser.setPrenom(userDetails.getPrenom());
            existingUser.setEmail(userDetails.getEmail());
            existingUser.setPassword(userDetails.getPassword());

            return userRepository.save(existingUser);
        } else {
            return null; // User with the specified ID not found
        }
    }

    @Override
    public void deleteUser(Long id) {

    }

}


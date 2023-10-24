package tn.msuser.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.msuser.Entity.User;
import tn.msuser.Repositorie.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Retrieve a user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Update user information
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Delete a user by ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
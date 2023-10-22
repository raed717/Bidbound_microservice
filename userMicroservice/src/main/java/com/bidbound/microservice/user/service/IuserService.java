package com.bidbound.microservice.user.service;

import com.bidbound.microservice.user.model.User;

import java.util.List;

public interface IuserService {
    List<User> findAllUsers();
    User findUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}
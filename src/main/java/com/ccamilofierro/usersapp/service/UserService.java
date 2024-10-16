package com.ccamilofierro.usersapp.service;

import java.util.List;

import com.ccamilofierro.usersapp.entity.User;

public interface UserService {
    User createUser(User user, boolean isAdmin);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}

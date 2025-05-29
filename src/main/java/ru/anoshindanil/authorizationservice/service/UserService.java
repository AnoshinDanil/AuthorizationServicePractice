package ru.anoshindanil.authorizationservice.service;

import ru.anoshindanil.authorizationservice.model.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    void deleteUserByEmail(String email);
    User updateUser(Long id, User user);
}

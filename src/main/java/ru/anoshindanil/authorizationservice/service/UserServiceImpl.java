package ru.anoshindanil.authorizationservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.anoshindanil.authorizationservice.model.entity.User;
import ru.anoshindanil.authorizationservice.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserByEmail(String email) {
        userRepository.deleteUserByEmail(email);
    }

    @Override
    public User updateUser(Long id, User user) {
        User userById = userRepository.getUserById(id);

        if (userById.getEmail() != null) {
            userById.setEmail(user.getEmail());
        }

        if (userById.getPassword() != null) {
            userById.setPassword(user.getPassword());
        }

        if (userById.getUsername() != null) {
            userById.setName(user.getName());
        }

        if (userById.getRole() != null) {
            userById.setRole(user.getRole());
        }
        return userById;
    }
}

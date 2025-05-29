package ru.anoshindanil.authorizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.anoshindanil.authorizationservice.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByEmail(String email);
    void deleteUserByEmail(String email);
    User getUserById(Long id);
}

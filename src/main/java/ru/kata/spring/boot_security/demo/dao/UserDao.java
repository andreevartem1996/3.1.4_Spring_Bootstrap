package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> getUsersList();

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    Optional<User> getUserById(int id);

    Optional<User> findByUsername(String username);
}

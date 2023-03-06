package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Repository
public interface UserDao {

    void addUser(User user);

    User getUserById(Long id);

    User getUserByName(String name);

    void updateUser(User user);

    void removeUserById(Long id);

    List<User> listUsers();
}
package ru.javamentor.springboot.service;

import ru.javamentor.springboot.user.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Integer id);

    public void deleteUser(Integer id);
}

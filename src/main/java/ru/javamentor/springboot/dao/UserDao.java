package ru.javamentor.springboot.dao;

import ru.javamentor.springboot.user.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Integer id);

    public void deleteUser(Integer id);
}
package ru.javamentor.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.springboot.dao.UserDao;
import ru.javamentor.springboot.user.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    @Transactional
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);

    }
}
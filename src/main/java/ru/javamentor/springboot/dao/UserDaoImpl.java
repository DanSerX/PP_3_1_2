package ru.javamentor.springboot.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import ru.javamentor.springboot.user.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = entityManager.createQuery("from User", User.class).getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public User getUser(Integer id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
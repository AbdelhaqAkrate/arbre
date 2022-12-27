package com.example.skillstree.daos;

import com.example.skillstree.config.Config;
import com.example.skillstree.daos.impl.UserDaoInterface;
import com.example.skillstree.entities.User;
import jakarta.persistence.*;

import java.util.List;

public class UserDao implements UserDaoInterface {
    public static EntityManager manager = Config.getEntityManagerFactory().createEntityManager();
    public boolean login(String email, String password)
    {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        TypedQuery<User> query = manager.createQuery("SELECT a FROM User a WHERE a.email = :email AND a.password = :password", User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        List<User> admins = query.getResultList();
        transaction.commit();
        manager.close();
        return admins.size() > 0;
    }
    public boolean newUser(User user)
    {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(user);
        transaction.commit();
        manager.close();
        return true;
    }
    public List<User> getAllUsers()
    {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        TypedQuery<User> query = manager.createQuery("SELECT a FROM User a", User.class);
        List<User> users = query.getResultList();
        transaction.commit();
        manager.close();
        return users;
    }
    public User findUser(Integer id)
    {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        User user = manager.find(User.class, id);
        transaction.commit();
        manager.close();
        return user;
        
    }
}

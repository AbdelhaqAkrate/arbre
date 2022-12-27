package com.example.skillstree.Services;

import com.example.skillstree.daos.UserDao;
import com.example.skillstree.entities.User;

import java.util.List;

public class UserServices {
    UserDao userDao = new UserDao();
    public boolean login(String email, String password)
    {
        return userDao.login(email, password);
    }
    public boolean newUser(User user)
    {
        return userDao.newUser(user);
    }
    public List<User> getAllUsers()
    {
        return userDao.getAllUsers();
    }
    public User findUser(Integer id)
    {
        return userDao.findUser(id);
    }
}

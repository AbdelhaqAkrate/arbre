package com.example.skillstree.daos.impl;

import java.util.List;

import com.example.skillstree.entities.User;

public interface UserDaoInterface {
    public boolean login(String email, String password);
    public boolean newUser(User user);
    public List<User> getAllUsers();
    public User findUser(Integer id);
}

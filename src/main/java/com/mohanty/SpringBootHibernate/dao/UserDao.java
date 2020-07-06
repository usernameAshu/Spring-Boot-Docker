package com.mohanty.SpringBootHibernate.dao;

import com.mohanty.SpringBootHibernate.models.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers() ;
    public User getUserById(int id);
    public void addUser(User user) ;
    public User updateUser(User user, int id);
    public void deleteUser(int id);
    public User updateCountry(User user, int id);

}

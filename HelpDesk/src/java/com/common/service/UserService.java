package com.common.service;


import com.common.model.User;
import java.util.List;

public interface UserService {

    User addUser(User user);
    void delete(long id);
    User editUser(User user);
    List<User> getAll();
    User findByLogin(String login);
        
}

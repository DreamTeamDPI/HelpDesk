package com.common.service;


import com.common.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    User addUser(User user);
    void delete(int id);
    User editUser(User user);
    List<User> getAll();
    User findByLogin(String login);

    User findByidUser(Integer idUser);
    public Page<User> findAllPages(int n);

    List<User> getByPredicate();

    List<User> getByRole(Integer i);

    Page<User> findAllPagesAndSort(int n, int i);

}

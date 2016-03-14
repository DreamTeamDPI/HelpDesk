package com.common.service.impl;


import com.common.entity.User;
import com.common.repository.UserRepository;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.common.repository.Specs.UserSpecs.*;
import static org.springframework.data.jpa.domain.Specifications.where;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User depart) {
        User savedBank = userRepository.saveAndFlush(depart);
        return savedBank;
    }

    @Override
    public User editUser(User depart) {
        return userRepository.saveAndFlush(depart);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void delete(int id) {
        userRepository.delete(id);
    }


    @Override
    public User findByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

    @Override
    public User findByidUser(Integer idUser) {
        return userRepository.findUserByIdUser(idUser);
    }

    @Override
    public Page<User> findAllPages(int n) {
        Pageable pgbl = new PageRequest(n, 10, new Sort(new Order(Direction.ASC, "firstName", Sort.NullHandling.NULLS_LAST),
                new Order(Direction.ASC, "lastName") {
                }));
        Page<User> page = userRepository.findAll(pgbl);
        return page;
        // userRepository.findAll(where(nameLikeSem()).and(hasSecondName()));
    }

    @Override
    public List<User> getByPredicate() {
        return userRepository.findAll(where(nameLikeSem()).and(hasSecondName()));
    }

    @Override
    public List<User> getByRole(Integer i) {
        return userRepository.findAll(where(findAllByRole(i)));
    }

    @Override
    public List<User> getFindUser(String findQuery) {
        List<User> pages =  userRepository.findAll(findUser(findQuery));
        return  pages;
    }


    @Override
    public Page<User> findAllPagesAndSort(int n, int i) {
        Pageable pgbl = new PageRequest(n, 10, new Sort(new Order(Direction.ASC, "firstName", Sort.NullHandling.NULLS_LAST),
                new Order(Direction.ASC, "lastName") {
                }));
        Page<User> pages = userRepository.findAll(findAllByRole(i), pgbl);
        return pages;
    }





}

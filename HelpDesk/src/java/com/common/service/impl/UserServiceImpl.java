package com.common.service.impl;

import com.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import com.common.service.UserService;
import com.common.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    //@Qualifier("dep")
    private UserRepository departRepository;
@Override
    public User addUser(User depart) {
        User savedBank = departRepository.saveAndFlush(depart);
        return savedBank;
    }

//    @Override
//    public void delete(long id) {
//        departRepository.delete(id);
//    }
@Override
    public User editUser(User depart) {
        return departRepository.saveAndFlush(depart);
    }

@Override
    public List<User> getAll() {
        return departRepository.findAll();
    }

    public void delete(long id) {
        departRepository.delete(id); 
    }


    @Override
    public User findByLogin(String login) {
        return departRepository.findUserByLogin(login);
    }

    @Override
    public User findByidUser(Long idUser) {
        return departRepository.findUserByidUser(idUser);
    }
 
}

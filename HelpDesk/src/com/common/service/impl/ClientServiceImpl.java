/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;


import com.common.entity.Client;
import com.common.repository.ClientRepository;
import com.common.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author SEMEN
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clRepository;
    
    @Override
    public Client addClient(Client cl) {
        return clRepository.saveAndFlush(cl);
    }

    @Override
    public void delete(long id) {
        clRepository.delete(id);
    }

    @Override
    public Client editClient(Client cl) {
        return clRepository.saveAndFlush(cl);
    }

    @Override
    public List<Client> getAll() {
        return clRepository.findAll();
    }
    
}

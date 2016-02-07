/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;

import com.common.model.Deprtment;
import com.common.repository.DepartRepository;
import com.common.service.DepartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SEMEN
 */
@Service 
public class DepartmentServiceImpl implements DepartService {
    
    @Autowired
    DepartRepository departRepository; 

    @Override
    public Deprtment addDepart(Deprtment depart) {
        return departRepository.saveAndFlush(depart);
    }

    @Override
    public void delete(long id) {
        departRepository.delete(id);
    }

    @Override
    public Deprtment editDepart(Deprtment depart) {
        return departRepository.saveAndFlush(depart);
    }

    @Override
    public List<Deprtment> getAll() {
        return departRepository.findAll();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;

import com.common.model.Employer;
import com.common.repository.EmployerRepository;
import com.common.service.EmployerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SEMEN
 */
@Service 
public class EmployerServiceImpl implements EmployerService{

    @Autowired
    EmployerRepository emplRepository; 
    
    @Override
    public Employer addEmployer(Employer empl) {
        return emplRepository.saveAndFlush(empl);
    }

    @Override
    public void delete(long id) {
        emplRepository.delete(id);
    }

    @Override
    public Employer editEmployer(Employer empl) {
        return emplRepository.saveAndFlush(empl);
    }

    @Override
    public List<Employer> getAll() {
        return emplRepository.findAll();
    }
    
}

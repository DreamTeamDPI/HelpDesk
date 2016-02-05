package com.common.service.impl;

import com.common.model.Department;
import com.common.repository.DepartRepository;
import com.common.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    //@Qualifier("dep")
    private DepartRepository departRepository;
@Override
    public Department addDepart(Department depart) {
        Department savedBank = departRepository.saveAndFlush(depart);
        return savedBank;
    }

//    @Override
//    public void delete(long id) {
//        departRepository.delete(id);
//    }
@Override
    public Department editDepart(Department depart) {
        return departRepository.saveAndFlush(depart);
    }

@Override
    public List<Department> getAll() {
        return departRepository.findAll();
    }

@Override
    public void delete(long id) {
        departRepository.delete(id); //To change body of generated methods, choose Tools | Templates.
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;


import com.common.entity.Organization;
import com.common.repository.OrganizationRepository;
import com.common.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author SEMEN
 */
@Service 
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizRepository;
    
    @Override
    public Organization addOrganiz(Organization organization) {
        return organizRepository.save(organization);
    }

    @Override
    public void delete(long id) {
        organizRepository.delete(id);
    }

    @Override
    public Organization editOrganiz(Organization organization) {
        return organizRepository.save(organization);
    }

    @Override
    public List<Organization> getAll() {
        return organizRepository.findAll();
    }
    
}

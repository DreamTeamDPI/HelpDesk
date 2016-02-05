/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;

import com.common.model.Role;
import com.common.repository.RoleRepository;
import com.common.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SEMEN
 */
@Service
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public Role addRole(Role role) {
        Role savedRole = roleRepository.saveAndFlush(role);
        return savedRole;
    }

    @Override
    public void delete(long id) {
        roleRepository.delete(id);
    }

    @Override
    public Role editRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}

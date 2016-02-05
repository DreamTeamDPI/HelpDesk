/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;

import com.common.model.Role;
import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface RoleService {
    Role addRole(Role role);
    void delete(long id);
    Role editRole(Role role);
    List<Role> getAll();

    
}

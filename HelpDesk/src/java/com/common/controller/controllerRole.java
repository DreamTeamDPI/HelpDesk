/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

import com.common.model.Role;
import com.common.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SEMEN
 */
@Controller
public class controllerRole {
    
    @Autowired
    RoleService role;

    @RequestMapping(value = "/rol" , method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		List<Role> listRoles = role.getAll();
		ModelAndView model = new ModelAndView("RoleList");
		model.addObject("roleList", listRoles);
		return model;
	}
}

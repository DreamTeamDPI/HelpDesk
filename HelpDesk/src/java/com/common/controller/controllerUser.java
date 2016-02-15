/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

import com.common.model.User;
import com.common.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SemmEs
 */
 @Controller
public class controllerUser {
    
    @Autowired
    UserService user;

    @RequestMapping(value = "UserList" , method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		List<User> listUsers = user.getAll();
		ModelAndView model = new ModelAndView("UserList");
		model.addObject("userList", listUsers);
		return model;
	}
        
        
//        @RequestMapping(value = "aUserList" , method = RequestMethod.GET)
//	public ModelAndView handleRequest1() throws Exception {
//		List<User> listUsers = user.getAll();
//		ModelAndView model = new ModelAndView("aUserList");
//		model.addObject("userList", listUsers);
//		return model;
//	}
//        
        
        @RequestMapping(value = "userDel", method = RequestMethod.GET)
	public ModelAndView deleteUser(long id) {
		user.delete(id);
		return new ModelAndView("redirect:/");		
	}
        
        
//        @RequestMapping(value = "userNew", method = RequestMethod.GET)
//	public ModelAndView editUser() {
//		ModelAndView model = new ModelAndView("UserForm");
//		model.addObject("user", new User());
//		return model;		
//	}
}
  

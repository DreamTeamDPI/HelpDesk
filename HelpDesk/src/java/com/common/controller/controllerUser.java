/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

import com.common.model.ClassUser;
import com.common.model.Role;
import com.common.model.User;
import com.common.service.RoleService;
import com.common.service.UserService;
import java.util.Date;
import java.util.List;
import jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SemmEs
 */
@Controller
public class controllerUser {

    @Autowired
    UserService user;
    @Autowired
    RoleService role;

    @RequestMapping(value = "UserList", method = RequestMethod.GET)
    public ModelAndView handleRequest() throws Exception {
        List<User> listUsers = user.getAll();
        List<Role> listRole = role.getAll();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", listUsers);
        model.addObject("size", listUsers.size());
        model.addObject("newUser", new User(2L));
        model.addObject("roleList", listRole);
        return model;
    }

    @RequestMapping(value = "UserList/time", method = RequestMethod.GET)
    public @ResponseBody
    User getTime(@RequestParam String name) {
        //String result = "Time for " + name + " is " + new Date().toString();
        return new User();//result;//user.findByLogin("SemmEs");
    }

    @RequestMapping(value = "UserList/del", method = RequestMethod.GET)
    public String deleteUser(long id) {
        user.delete(id);
        return "hi";
    }

    @RequestMapping(value = "UserList/add", method = RequestMethod.GET)
    public @ResponseBody
    User addUser(User type, String roleid) {
        //user.addUser(newUser);
        Long n = Long.parseLong(roleid);
        type.setRoleidRole(new Role(n));
        user.addUser(type);
        //System.out.println("ok");
        return type;
    }
//        @RequestMapping(value = "userNew", method = RequestMethod.GET)
//	public ModelAndView editUser() {
//		ModelAndView model = new ModelAndView("UserForm");
//		model.addObject("user", new User());
//		return model;		
//	}

    @RequestMapping(value = "UserList/editId", method = RequestMethod.GET)
    
    public @ResponseBody ClassUser editUser(long id) {
        User listUsers = user.findByidUser(id);
        ClassUser t;
       
        t = new ClassUser(listUsers);
      
        return t;
    }
}

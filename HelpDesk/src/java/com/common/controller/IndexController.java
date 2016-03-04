/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

/**
 *
 * @author SemmEs
 */
import com.common.model.User;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping("/")
public class IndexController {
//                    @Autowired
//                    UserService user;
    @RequestMapping( method = RequestMethod.GET)
	public String handleRequest(ModelMap m) throws Exception {
            //user.addUser(new User());
		m.addAttribute("title","welcome to hello page");
		return "hi";
                
                
        }
}
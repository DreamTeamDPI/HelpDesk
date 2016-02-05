/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

import com.common.model.User;
import com.common.service.impl.UserServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.common.service.UserService;

/**
 *
 * @author SEMEN
 */
@Controller
public class controllerUser {
    
    @Autowired
    UserService dep;

    @RequestMapping(value = "pages/" , method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		List<User> listDeparts = dep.getAll();
		ModelAndView model = new ModelAndView("DepartList");
		model.addObject("departList", listDeparts);
		return model;
	}
}

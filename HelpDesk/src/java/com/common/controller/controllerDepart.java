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
public class controllerDepart {
    
//    @Autowired
//    UserService dep;
//
//    @RequestMapping(value = "pages/uDepartList" , method = RequestMethod.GET)
//	public ModelAndView handleRequest() throws Exception {
//		List<User> listDeparts = dep.getAll();
//		ModelAndView model = new ModelAndView("uDepartList");
//		model.addObject("departList", listDeparts);
//		return model;
//	}
//        
//        
//        @RequestMapping(value = "pages/aDepartList" , method = RequestMethod.GET)
//	public ModelAndView handleRequest1() throws Exception {
//		List<User> listDeparts = dep.getAll();
//		ModelAndView model = new ModelAndView("aDepartList");
//		model.addObject("departList", listDeparts);
//		return model;
//	}
//        
//        
//          @RequestMapping(value = "pages/delete", method = RequestMethod.GET)
//	public ModelAndView deleteUser(long id) {
//		
//		dep.delete(id);
//		return new ModelAndView("redirect:/");		
//	}
//        
//        
//        @RequestMapping(value = "list/new", method = RequestMethod.GET)
//	public ModelAndView editUser() {
//		ModelAndView model = new ModelAndView("DepartForm");
//		model.addObject("user", new User());
//		return model;		
//	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

import com.common.model.Department;
import com.common.service.DepartService;
import com.common.service.impl.DepartServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SEMEN
 */
@Controller
public class controllerDepart {
    
    @Autowired
    DepartService dep;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		List<Department> listDeparts = dep.getAll();
		ModelAndView model = new ModelAndView("DepartList");
		model.addObject("departList", listDeparts);
		return model;
	}
}

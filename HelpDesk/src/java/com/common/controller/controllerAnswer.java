/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;

import com.common.model.Answer;
import com.common.service.AnswerService;
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
public class controllerAnswer {
    @Autowired
    private AnswerService answService;
    
    @RequestMapping(value = "pages/answ" , method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		List<Answer> listRoles = answService.getAll();
		ModelAndView model = new ModelAndView("AnswerList");
		model.addObject("roleList", listRoles);
		return model;
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.controller;


import com.common.entity.ClassUser;
import com.common.entity.Role;
import com.common.entity.User;
import com.common.service.RoleService;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.*;

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

    @RequestMapping(value = "UserList/ex", method = RequestMethod.GET)
    public ModelAndView ex(@RequestParam Map<String,String> allRequestParams) throws Exception {


        ModelAndView model = new ModelAndView("UserListSorting");
        Map<Integer,String> pnn = new HashMap<>();
        List<Integer> pageNumber = new ArrayList<>();
        Page<User> pages;
        int page = 1;
        String name = "";

        if(allRequestParams.containsKey("page"))page = Integer.parseInt(allRequestParams.get("page"));
        if(allRequestParams.containsKey("name")){
            name = allRequestParams.get("name");}

        page--;
        if(!name.isEmpty()){
            pages= user.findAllPagesAndSort(page, name);

            for (int j = 1; j <= pages.getTotalPages(); j++) {
                pageNumber.add(j);
                String s = "page=" + String.valueOf(j) + "&name=" + name;
                pnn.put(j,s);

            }

        } else  {
            pages=user.findAllPages(page);//findAllPagesAndSort(page, 1);
            System.out.println("ret" + pages.getContent().size());

            for (int j = 1; j <= pages.getTotalPages(); j++) {
                pageNumber.add(j);
                String s = "page=" + String.valueOf(j);
                pnn.put(j,s);

            }
        }

        List<User> list = pages.getContent();


        model.addObject("listNumberPage", pnn);
        model.addObject("userList", list);
        return model;

    }


    @RequestMapping(value = "UserList", method = RequestMethod.GET)
    public ModelAndView handleRequest(int page) throws Exception {

        Page<User> pages = user.findAllPages(page - 1);//user.getNotAll(n,k);
        int totalPages = pages.getTotalPages();
        int totalElements = (int) pages.getTotalElements();
        List<User> list = pages.getContent();
        List<Role> roleList = role.getAll();
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1,roleList.get(0).toString());
        hashmap.put(2,roleList.get(1).toString());
        System.out.println("===========================");

        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", list);
        model.addObject("size", totalElements);
        model.addObject("roleCollection", hashmap);
        List<Integer> pageNumber = new ArrayList<>();



        for(int i = 1 ; i <= totalPages; i++){
            pageNumber.add(i);
        }
        model.addObject("listNumberPage",pageNumber);

        User us = new User();
        us.setRoleIdRole(2);
        model.addObject("newUser", us);

        model.addObject("listNm", roleList);
        List<User> llistByPred = user.getByPredicate();
        System.out.println(llistByPred);

        return model;
    }

    @RequestMapping(value = "UserList/time", method = RequestMethod.GET)
    public @ResponseBody
    User getTime(@RequestParam String name) {
        //String result = "Time for " + name + " is " + new Date().toString();
        return new User();//result;//user.findByLogin("SemmEs");
    }

    @RequestMapping(value = "UserList/sort", method = RequestMethod.GET)
    public ModelAndView sortUser(int i) {
        ModelAndView model = new ModelAndView("userSortTable");
        Page<User> pages = user.findAllPagesAndSort(0, i);//user.getNotAll(n,k);
        List<User> list = pages.getContent();
        List<Integer> pageNumber = new ArrayList<>();
        for (int j = 1; j <= pages.getTotalPages(); j++) {
            pageNumber.add(j);
        }
        model.addObject("listNumberPage", pageNumber);
        model.addObject("userList", list);
        model.addObject("size", pages.getTotalElements());
        return model;
    }

    @RequestMapping(value = "UserList/del", method = RequestMethod.GET)
    public String deleteUser(int id) {
        user.delete(id);
        return "hi";
    }

    @RequestMapping(value = "UserList/add", method = RequestMethod.GET)
    public @ResponseBody
    String addUser(@Valid ClassUser type, BindingResult result) {
        if(result.hasErrors()) return "err";
        System.out.println(type.toString());
        type.setRoleidRole(1);
        User user1 = new User(type);
        user.addUser(user1);
        return "suc";
}

    @RequestMapping(value = "UserList/editId", method = RequestMethod.GET)
    public
    @ResponseBody
    User editUser(int id) {
        User listUsers = user.findByidUser(id);


        return listUsers;
    }

}

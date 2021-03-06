package com.bm.rra.crm.controller;

import com.bm.rra.crm.entity.crm.SalesManager;
import com.bm.rra.crm.entity.crm.User;
import com.bm.rra.crm.service.SalesManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class UserController {

    @Autowired
    SalesManagerService salesManagerService;

    @RequestMapping(value = "/crm/list", method = RequestMethod.GET)
    public ModelAndView userList() {
        ModelAndView model = new ModelAndView();
        model.setViewName("crm/list");
        model.addObject("users",
                StreamSupport.
                        stream(salesManagerService.findAll().spliterator(), false).distinct().collect(Collectors.toList()));
        return model;
    }

    @RequestMapping(value = "/crm/user", method = RequestMethod.GET)
    public String addNewUser(Model model) {
        model.addAttribute(new User());
        return "crm/user";
    }

    @RequestMapping(value = "/crm/user", method = RequestMethod.POST)
    public ModelAndView saveUser(@Valid SalesManager user) {
        salesManagerService.save(user);
        return userList();
    }

    @RequestMapping(value = "/crm/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") Long id) {
        SalesManager user = salesManagerService.getById(id);
        salesManagerService.delete(user);
        return userList();
    }

    @RequestMapping(value = "/crm/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView model = new ModelAndView();
        model.setViewName("crm/edit");
        model.addObject("user", salesManagerService.getById(id));
        return model;
    }

    @RequestMapping(value = "/crm/update", method = RequestMethod.PUT)
    public ModelAndView update(@Valid SalesManager user) {
        salesManagerService.save(user);
        return userList();
    }
}
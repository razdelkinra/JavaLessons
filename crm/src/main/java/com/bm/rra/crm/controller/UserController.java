package com.bm.rra.crm.controller;

import com.bm.rra.crm.entity.SalesManager;
import com.bm.rra.crm.service.SalesManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    SalesManagerService salesManagerService;

//    @RequestMapping("/crm/list")
//    public ModelAndView list(ModelAndView modelAndView) {
//        SalesManager salesManager = new SalesManager();
//        salesManager.setFirstName("Roman");
//        salesManager.setLastName("Razdelkin");
//        salesManagerService.save(salesManager);
//        modelAndView.addObject("users", salesManagerService.findAll());
//        modelAndView.setViewName("crm/list");
//        return modelAndView;
//    }


    @RequestMapping(value = "/crm/list", method = RequestMethod.GET)
    public ModelAndView userList(ModelAndView model) {
        model.setViewName("crm/list");
        model.addObject("users", salesManagerService.findAll());
        return model;
    }

    @RequestMapping(value = "/crm/user", method = RequestMethod.GET)
    public ModelAndView addNewUser(ModelAndView model, @Valid SalesManager user) {
        model.addObject("firstName", user.getFirstName());
        model.addObject("lastName", user.getLastName());
        model.setViewName("crm/user");
        model.addObject("user", salesManagerService.save(user));
        return model;
    }
//    @RequestMapping(value = "/crm/user", method = RequestMethod.POST)
//    public String addBook(@ModelAttribute("user") SalesManager user) {
//
//        salesManagerService.save(user);
//
//        return "redirect:/crm/list";
//
//    }
}
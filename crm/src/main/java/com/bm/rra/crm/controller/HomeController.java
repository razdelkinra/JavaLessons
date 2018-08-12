package com.bm.rra.crm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Value("${welcome.message}")
    private String message;

    @RequestMapping(value = {"/", "crm/hello"}, method = RequestMethod.GET)
    public ModelAndView hello(ModelAndView model) {
        model.setViewName("crm/hello");
        model.addObject("message", message);
        return model;
    }



}

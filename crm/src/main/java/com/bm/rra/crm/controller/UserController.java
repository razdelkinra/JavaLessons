package com.bm.rra.crm.controller;

import com.bm.rra.crm.service.SalesManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class UserController {

    @Autowired
    SalesManagerService salesManagerService;

    @RequestMapping("/crm/list")
    public ModelAndView list(ModelAndView modelAndView) throws IOException {

        modelAndView.setViewName("crm/list");
        modelAndView
                .addObject("users", salesManagerService.findAll());
        return modelAndView;
    }

}

package com.bm.rra.crm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Value("${welcome.message}")
    private String message;

    @RequestMapping(value = {"/", "/hello"}, method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", message);
        return "hello";
    }

}

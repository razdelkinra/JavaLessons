package com.bm.rra.crm.controller;

import com.bm.rra.crm.entity.Manager;
import com.bm.rra.crm.entity.SalesManager;
import com.bm.rra.crm.service.SalesManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.math.BigDecimal;

@Controller
public class UserController {

    @Autowired
    SalesManagerService salesManagerService;

    @RequestMapping("/crm/list")
    public ModelAndView list(ModelAndView modelAndView) throws IOException {
        SalesManager salesManager = new SalesManager();
        salesManager.setFirstName("Ruslan");
        salesManager.setLastName("Razdelkin");
        salesManager.setPhoneNumber("8926757574");
        salesManager.setYearBonus(new BigDecimal(1223));
        salesManagerService.save(salesManager);
        modelAndView.setViewName("crm/list");
        modelAndView
                .addObject("users", salesManagerService.findAll());
        return modelAndView;
    }

}

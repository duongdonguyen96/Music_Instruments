package com.codegym.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/vendors")
public class VendorController {
    @GetMapping(value = "")
    public ModelAndView listOrders(){
        ModelAndView modelAndView=new ModelAndView("admin/Vendor");
        return modelAndView;
    }
}

package com.codegym.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping(value = "")
    public ModelAndView listProducts(){
        ModelAndView modelAndView=new ModelAndView("/admin/Product");
        return modelAndView;
    }
}

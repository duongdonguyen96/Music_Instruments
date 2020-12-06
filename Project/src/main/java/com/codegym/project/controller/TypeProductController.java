package com.codegym.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/typeProducts")
public class TypeProductController {
    @GetMapping(value = "")
    public ModelAndView listTypes(){
        ModelAndView modelAndView=new ModelAndView("admin/ProductLine");
        return modelAndView;
    }
}

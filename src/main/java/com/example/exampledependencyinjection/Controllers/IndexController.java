package com.example.exampledependencyinjection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.exampledependencyinjection.Models.service.IServicio;

@Controller
public class IndexController {
    
    //Inyección  
    @Autowired
    private IServicio ms;
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("obj", ms.operacion());
        return "index";
    }
}

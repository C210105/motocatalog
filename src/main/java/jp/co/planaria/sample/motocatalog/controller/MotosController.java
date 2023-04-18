package jp.co.planaria.sample.motocatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MotosController {
    
    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }
}

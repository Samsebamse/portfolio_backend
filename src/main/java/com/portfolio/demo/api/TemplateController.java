package com.portfolio.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("index")
    public String home() {
        return "index";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

}

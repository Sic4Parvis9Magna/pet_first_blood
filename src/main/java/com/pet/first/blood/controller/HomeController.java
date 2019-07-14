package com.pet.first.blood.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getPage() {
        log.warn("hit page");
        return "index";
    }
}

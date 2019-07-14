package com.pet.first.blood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomErrorController {

    @RequestMapping(path = "/error")
    public Map<String, Object> handle(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", request.getAttribute("javax.servlet.error.status_code"));
        map.put("reason", request.getAttribute("javax.servlet.error.message"));
        map.put("exception_type", request.getAttribute("javax.servlet.error.exception_type"));
        map.put("exception", request.getAttribute("javax.servlet.error.exception"));
        map.put("custom", "hello from custom error controller");
        return map;
    }

}

package com.example.demo4.controller;

import com.example.demo4.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    public String testPage(){
        System.out.println("testService.getOne() = "+testService.getOne());
        return "/test";
    }

}

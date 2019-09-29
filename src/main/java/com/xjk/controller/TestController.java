package com.xjk.controller;

import com.xjk.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("test come in ..");
        return "test";
    }

    @RequestMapping("/test.do")
    @ResponseBody
    public String test2(){
        System.out.println("test2 come in ..");
        return "test";
    }

    @RequestMapping("/test.action")
    @ResponseBody
    public String test3(){
        System.out.println("test3 come in ..");
        return "test";
    }

}

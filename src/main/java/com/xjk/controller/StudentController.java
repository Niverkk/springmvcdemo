package com.xjk.controller;

import com.xjk.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    @RequestMapping("/getAllStudent")
    @RequestMapping("/student/getAllStudent")
    public ModelAndView getAllStudent(){
        System.out.println("come7777777 in222 ..");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", studentService.getAllStudent());
        modelAndView.setViewName("main");

        return modelAndView;
    }

    //@RequestMapping("/getAllStudent")
    public ModelAndView getS(){
        System.out.println("come in6666 ..");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", studentService.getAllStudent());
        modelAndView.setViewName("main");

        return modelAndView;
    }
}

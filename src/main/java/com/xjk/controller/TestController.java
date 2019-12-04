package com.xjk.controller;

import com.xjk.modal.Student;
import com.xjk.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping("/test4")
    @ResponseBody
    public String test4(@RequestBody Student stu,String name,Integer age){
        System.out.println("test4 come in ..");
        System.out.println("stu:"+stu);
        System.out.println("name:"+name);
        System.out.println("age:"+age);

        return "test4";
    }

    @RequestMapping("/test5/{name}/{age}")
    @ResponseBody
    /*以逗号分隔形式传来  age格式: xkk,fdf,xx */
    public String test5(@PathVariable String name, @PathVariable List<String> age){
        //, @PathVariable List<String> age
        System.out.println("age:"+age);
        System.out.println("test5 come in ..");
        System.out.println("name:"+name);

        return "test5";
    }

    @RequestMapping("/test6/{name}/{age}")
    @ResponseBody
    public String test6(@PathVariable String name, @PathVariable @RequestParam String age,@RequestParam int id){
        System.out.println("test6 come in ..");
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("age:"+age);

        return "test6";
    }


    @RequestMapping("/test7/{name}/{age}")
    @ResponseBody
    /*@RequestParam @PathVariable 能一起使用 但值以RequestParam为准*/
    public String test7(@PathVariable String name, @RequestParam @PathVariable String age,@RequestParam int id){
        System.out.println("test7 come in ..");
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("age:"+age);

        return "test7";
    }

    @RequestMapping("/test8/{name}")
    @ResponseBody
    /*@RequestParam @PathVariable 能一起使用 但值以RequestParam为准*/
    public String test8(String name, Integer age){
        System.out.println("test8 come in ..");
        System.out.println("name:"+name);
        System.out.println("age:"+age);

        return "test8";
    }

    @RequestMapping("/test9")
    @ResponseBody
    public String test9(Student stu, String name, Integer age){
        System.out.println("test9 come in ..");
        System.out.println("stu:"+stu);
        System.out.println("name:"+name);
        System.out.println("age:"+age);

        return "test9";
    }

    @RequestMapping("/test10")
    @ResponseBody
    public String test10(Student stu){
        System.out.println("test10 come in ..");
        System.out.println("stu:"+stu);

        return "test10";
    }

    @RequestMapping("/test11")
    @ResponseBody
    public String test11(@RequestParam("userNames[]") List<String> userName){
        System.out.println("test11 come in ..");
        System.out.println("userName:"+userName);

        return "test11";
    }

    @RequestMapping("/test12")
    @ResponseBody
    public String test12(@ModelAttribute("stu") Student stu){
        System.out.println("test12 come in ..");
        System.out.println("stu:"+stu);

        return "test12";
    }

    public @ModelAttribute("stu") Student test13(){
        Student stu = new Student();
        stu.setAge(32);
        stu.setName("fdfd");
        return stu;
    }

}

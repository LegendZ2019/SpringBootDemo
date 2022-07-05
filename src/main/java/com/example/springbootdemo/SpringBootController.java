package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {
    @RequestMapping(value = "/SpringBootDemo/say")
    public @ResponseBody String say(){
        return "hello,world";
    }
}

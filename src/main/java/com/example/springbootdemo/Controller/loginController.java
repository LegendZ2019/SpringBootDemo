package com.example.springbootdemo.Controller;

import com.example.springbootdemo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.springbootdemo.pojo.User;

@Controller
public class loginController {
    @Autowired
    private LoginService loginservice;

    @RequestMapping(value = "/SpringBootDemo/login")
    public @ResponseBody String getPassword(){
        String retPasswd = loginservice.getPassword("admin");
        String rawPasswd;
        System.out.println(retPasswd);
        return retPasswd;
    }

}

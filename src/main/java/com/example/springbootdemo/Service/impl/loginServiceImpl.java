package com.example.springbootdemo.Service.impl;
import com.example.springbootdemo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.dao.mappers.LoginMapper;

@Service
public class loginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String getPassword(String username){
        return loginMapper.getPassword(username);
    }
}
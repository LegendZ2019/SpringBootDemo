package com.example.springbootdemo.dao.mappers;
import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {  //表操作基础类
    String getPassword(String username);

}

package com.px.egame.service;

import com.px.egame.entity.User;
import com.px.egame.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public String insertUser(){
        System.out.println("test");
        User user=new User();
        user.setRoleId(1);
        user.setUsername("zhangsan");
        user.setSex("男");
        user.setPhoneNumber("18227591016");
        user.setPassword("817801");
        user.setEmail("976409973@qq.com");
        user.setCreatetime(new Date());

        int s=userMapper.insert(user);
        String str="";
        if (s==1)
            str="yes";
        else
            str="no";
        return str;

    }
}

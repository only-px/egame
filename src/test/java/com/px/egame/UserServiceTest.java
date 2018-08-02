package com.px.egame;

import com.px.egame.entity.User;
import com.px.egame.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EgameApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class UserServiceTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        System.out.println("黄海江");
        User user=new User();
        user.setRoleId(1);
        user.setUsername("黄海江");
        user.setSex("男");
        user.setPhoneNumber("18227591016");
        user.setPassword("817801");
        user.setEmail("976409973@qq.com");
        user.setCreatetime(new Date());
        userMapper.insert(user);
    }

}

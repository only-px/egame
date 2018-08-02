package com.px.egame.controller;
import java.util.Date;

import com.px.egame.entity.TUser;
import com.px.egame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller        // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
   // private UserService userService;
    @RequestMapping(value = "/login")
    public ModelAndView getUser() {
       // System.out.println(userService.insertUser());
ModelAndView mv=new ModelAndView("index");
        TUser u = new TUser();
        u.setName("yes");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc2");
        u.setDesc("hello imooc2~~");


        return mv;

}
}
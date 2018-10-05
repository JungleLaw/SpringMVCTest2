package cn.law.springmvc.demo.controller;

import cn.law.springmvc.demo.pojo.User;
import cn.law.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/mybatis")
    public String mybatis() {
        User user = new User();
        user.setUsername("user2");
        user.setPassword("pwd12");
        userService.insert(user);
        return "success";
    }
}

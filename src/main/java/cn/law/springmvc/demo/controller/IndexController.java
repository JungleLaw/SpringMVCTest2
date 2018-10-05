package cn.law.springmvc.demo.controller;

import cn.law.springmvc.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
//@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/json")
    public void json(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("asdad");
    }

    @RequestMapping("/login")
    public String login(User user) {
        System.out.println(user.getUsername() + " " + user.getPassword());
        return "login-suc";
    }

    @RequestMapping("/request1")
    public void request(@RequestParam("id") int id, @RequestParam("name") String name) {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }


    @RequestMapping("/request2")
    public void request(@RequestBody String body){
        System.out.println(body);
    }
}

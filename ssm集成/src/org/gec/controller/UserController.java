package org.gec.controller;

import org.gec.pojo.User;
import org.gec.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserLoginService userLoginService;
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){

        User user = userLoginService.userLogin(username,password);
        if (user!=null){
            session.setAttribute("user_login",user);
            return "forward:toCinema";
        }else {
            return "login";
        }


    }
}

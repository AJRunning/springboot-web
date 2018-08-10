package com.runningsss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author liqings
 * @date 2018-08-07
 */
@Controller
public class LoginContoller {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password,
                        Map<String, Object> map, HttpSession session) {
        if (username.equals("admin") && password.equals("111111")) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }
        map.put("msg", "用户名密码错误！");
        return "login";
    }
}

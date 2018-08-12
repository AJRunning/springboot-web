package com.runningsss.controller;

import com.runningsss.exception.UserNotExist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author liqings
 * @date 2018-08-04
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("userName") String userName) {
        if ("111".equals(userName)){
            throw new UserNotExist();
        }
        return "success";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {

        map.put("hello", "<h1>你好呀</h1>");
        map.put("users", Arrays.asList("magic", "tony", "running"));
        return "success";
    }
}

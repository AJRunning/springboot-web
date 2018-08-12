package com.runningsss.controller;

import com.runningsss.exception.UserNotExist;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liqings
 * @date 2018-08-12
 */
@ControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(UserNotExist.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();

        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notexist");
        map.put("message","用户出错啦");

//        request.setAttribute("ext",map);
        //转发到/error
        return "forward:/error";
    }
}

package com.runningsss.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liqings
 * @date 2018-08-07
 */
public class LoginHandlerIntecept implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user == null) {
            request.setAttribute("msg", "没有登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }

        return true;
    }
}

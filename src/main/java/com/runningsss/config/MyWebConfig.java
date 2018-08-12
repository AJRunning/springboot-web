package com.runningsss.config;

import com.runningsss.component.LoginHandlerIntecept;
import com.runningsss.component.MyLocleResovler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liqings
 * @date 2018-08-05
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("running", "success");
        registry.addViewController("").setViewName("login");
        registry.addViewController("index.html").setViewName("login");
        registry.addViewController("main.html").setViewName("dashboard");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocleResovler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       /* registry.addInterceptor(new LoginHandlerIntecept()).addPathPatterns("/**").
                excludePathPatterns("/", "/index.html", "/user/login", "/asserts/**");*/
    }

}

package com.qt.employmanage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/registerpage").setViewName("register");
        registry.addViewController("/loginpage").setViewName("login");
        registry.addViewController("/indexpage").setViewName("index");
        registry.addViewController("/successpage").setViewName("success");
        registry.addViewController("/employeeaddpage").setViewName("employee_add");
        registry.addViewController("/employeeupdatepage").setViewName("employee_update");
    }
}

package com.qt.employmanage.controller;

import com.qt.employmanage.pojo.Admin;
import com.qt.employmanage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(Admin admin){
        adminService.register(admin);
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Admin admin){
        Admin ad = adminService.login(admin);
        if (ad == null){
            return "fail";
        }
        return "index";
    }
}

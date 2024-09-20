package com.qt.employmanage.service;

import com.qt.employmanage.pojo.Admin;

public interface AdminService {
    void register(Admin admin);

    Admin login(Admin admin);
}

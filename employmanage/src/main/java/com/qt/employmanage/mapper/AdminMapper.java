package com.qt.employmanage.mapper;

import com.qt.employmanage.pojo.Admin;

public interface AdminMapper {
    void register(Admin admin);

    Admin login(Admin admin);
}

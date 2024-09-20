package com.qt.employmanage.service.imp;

import com.qt.employmanage.mapper.AdminMapper;
import com.qt.employmanage.pojo.Admin;
import com.qt.employmanage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void register(Admin admin) {
        adminMapper.register(admin);

    }

    @Override
    public Admin login(Admin admin) {
        Admin ad = adminMapper.login(admin);
        return ad;
    }
}

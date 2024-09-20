package com.qt.employmanage.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qt.employmanage.mapper.EmployeeMapper;
import com.qt.employmanage.pojo.Employee;
import com.qt.employmanage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 4);
        //查询所有的员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public int deleteEmployee(int empId) {
        int result = employeeMapper.deleteEmployee(empId);
        return result;
    }

    @Override
    public int addEmployee(Employee employee) {
        int result = employeeMapper.addEmployee(employee);
        return result;
    }

    @Override
    public int updateEmployee(Employee employee) {
        int result = employeeMapper.updateEmployee(employee);
        return result;
    }
}

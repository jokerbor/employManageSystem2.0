package com.qt.employmanage.service;

import com.github.pagehelper.PageInfo;
import com.qt.employmanage.pojo.Employee;

public interface EmployeeService {
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    int deleteEmployee(int empId);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);
}

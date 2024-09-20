package com.qt.employmanage.mapper;

import com.qt.employmanage.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getAllEmployee();

    int deleteEmployee(@Param("empId") int empId);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);
}

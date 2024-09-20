package com.qt.employmanage.controller;

import com.github.pagehelper.PageInfo;
import com.qt.employmanage.pojo.Employee;
import com.qt.employmanage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page", page);
        //跳转到employee_list.html
        return "employee_list";
    }

    @RequestMapping("/employeedelete/{empId}")
    public String deleteEmployee(@PathVariable("empId") int empId){
        int result = employeeService.deleteEmployee(empId);
        if (result != 1){
            return "fail";
        }
        return "success";
    }

    @RequestMapping(value = "/employeeadd",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        int result = employeeService.addEmployee(employee);
        if (result != 1){
            return "fail";
        }
        return "success";
    }

    @RequestMapping(value = "/employeeupdate",method = RequestMethod.POST)
    public String updateEmployee(Employee employee){
        int result = employeeService.updateEmployee(employee);
        if (result != 1){
            return "fail";
        }
        return "success";
    }
}

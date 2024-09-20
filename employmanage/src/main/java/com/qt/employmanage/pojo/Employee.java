package com.qt.employmanage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private Integer empId;

    private String empName;

    private Integer age;

    private String gender;

    private String email;
}

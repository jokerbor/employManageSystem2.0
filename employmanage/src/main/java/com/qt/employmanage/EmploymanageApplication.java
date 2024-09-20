package com.qt.employmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.qt.employmanage.mapper")
@SpringBootApplication
public class EmploymanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmploymanageApplication.class, args);
    }

}

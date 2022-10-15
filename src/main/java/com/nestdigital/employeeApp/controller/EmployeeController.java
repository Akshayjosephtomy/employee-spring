package com.nestdigital.employeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/home")
    public String Home(){
        return  "this is home";
    }

    @GetMapping("/add")
    public  String Employeeadd(){
        return  "this is employee add page";
    }

    @GetMapping("/search")
    public String Employeesearch(){
        return  "this is employee search page";
    }

    @GetMapping("/delete")
    public String Employeedelete(){
        return "this is employee delete page";
    }
}

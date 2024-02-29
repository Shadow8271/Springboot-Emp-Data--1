package com.atharva.Emp11.ControllerLayer;

import com.atharva.Emp11.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.UnableToRegisterMBeanException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class controller {

    @Autowired
    private Services services;
    @PostMapping("/l")
    public String str(@RequestParam Integer id, @RequestParam String name, @RequestParam Integer age, @RequestParam String Designation,@RequestParam Integer Salary) {
        System.out.println("Received ID: " + id);
        System.out.println("Received Name: " + name);
        return "Hello " + name + ". Your ID is: " + id + " age= "+ age + " Rs" + Salary + "Desgn" + Designation ;
    }
}

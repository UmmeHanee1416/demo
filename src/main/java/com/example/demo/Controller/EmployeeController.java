package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    public EmployeeService empSer;

    @GetMapping("/")
    public List<Employee> getAll(){
        return empSer.getData();
    }

    @PostMapping("/")
    public Employee addAll(@RequestBody Employee employee){
        return empSer.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getDataById(@PathVariable("id") Long id){
        return empSer.getDatabyId(id);
    }

    @PutMapping("/")
    public Employee updateData(@RequestBody Employee employee){
        return empSer.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable("id") Long id){
        empSer.deleteData(id);
    }
}

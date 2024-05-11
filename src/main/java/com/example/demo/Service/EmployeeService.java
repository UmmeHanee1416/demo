package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepo empRepo;

    public List<Employee> getData() {
        return empRepo.findAll();
    }

    public Employee getDatabyId(Long id) {
        return empRepo.findById(id).get();
    }

    public Employee save(Employee emp) {
        return empRepo.save(emp);
    }

    public void deleteData(Long id) {
        empRepo.deleteById(id);
    }
}

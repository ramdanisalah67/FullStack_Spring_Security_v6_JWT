package com.helloIftekhar.springJwt.controller;

import com.helloIftekhar.springJwt.model.Employee;
import com.helloIftekhar.springJwt.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")

@RequiredArgsConstructor
public class DemoController {

    private final EmployeeRepository employeeRepository;
    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello from secured url");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> adminOnly() {
        return ResponseEntity.ok("Hello from admin only url");
    }

    @GetMapping("employees")
    public List<Employee> allEmployees(){

        return employeeRepository.findAll();
    }

}

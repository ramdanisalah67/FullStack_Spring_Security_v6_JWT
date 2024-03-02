package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

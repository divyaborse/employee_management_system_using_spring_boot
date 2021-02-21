package com.example.spring_boot_thymeleaf_crud_web_app.repository;

import com.example.spring_boot_thymeleaf_crud_web_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}

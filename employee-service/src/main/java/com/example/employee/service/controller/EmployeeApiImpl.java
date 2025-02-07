package com.example.employee.service.controller;

import com.example.employee.api.EmployeeApi;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class EmployeeApiImpl implements EmployeeApi {

    private final EmployeeService employeeService;


    @Override
    public ResponseEntity<Employee> addEmployee(Employee employee) {
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }



}

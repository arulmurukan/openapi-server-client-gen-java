package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.service.model.EmployeeEntity;
import com.example.employee.service.model.ModelMapper;
import com.example.employee.service.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(modelMapper::employeeEntityToDto)
                .collect(Collectors.toList());
    }

    public Employee saveEmployee(Employee employee) {
        return modelMapper.employeeEntityToDto(employeeRepository.save(modelMapper.dtoToEmployeeEntity(employee)));
    }
}

package com.example.employee.service.model;

import com.example.employee.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelMapper {

  Employee employeeEntityToDto(EmployeeEntity employee);
  EmployeeEntity dtoToEmployeeEntity(Employee employee);

}

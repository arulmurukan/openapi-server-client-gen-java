package com.example.employee.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_id_gen")
    @SequenceGenerator(name = "employee_id_gen", sequenceName = "employee_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 250)
    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "age")
    private Integer age;

}
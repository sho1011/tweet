package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("EMPLOYEES")
public class EmployeeEntity {

    @Id
    private final String hrid;
    private String name;
}

package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Iterable<EmployeeEntity> findAll(){
        return employeeRepository.findAll();
    }

    public EmployeeEntity findBy(String hrid){
        return employeeRepository.findBy(hrid);
    }
}

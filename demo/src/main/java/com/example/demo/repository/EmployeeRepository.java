package com.example.demo.repository;

import com.example.demo.entity.EmployeeEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String> {
    @Query("SELECT * FROM employees WHERE hrid = :hrid")
    //@Paramの中の値が:hridに入れられる
    EmployeeEntity findBy(@Param("hrid") String hrid);
}

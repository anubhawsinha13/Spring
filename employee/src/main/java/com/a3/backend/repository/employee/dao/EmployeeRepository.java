package com.a3.backend.repository.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.a3.backend.repository.employee.model.Employee;

@Repository
public class EmployeeRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee>  findAll(){


        List<Employee> result = jdbcTemplate.query("select employee_id from HR.employees", (rs, rowNum) -> new Employee(rs.getInt("employee_id")));

        return result;
    }


}
package com.a3.backend.repository.employee.model;

public class Employee{

    int employee_id;

    public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Employee(int employee_id){
    this.employee_id = employee_id;

    };

    
}
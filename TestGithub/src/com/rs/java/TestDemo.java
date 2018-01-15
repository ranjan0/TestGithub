package com.rs.java;

import com.rs.command.Employee;

public class TestDemo {
	private Employee emps;
	private int empId=123; 

	public Employee getEmp() {
		return emps;
	}

	public void setEmp(Employee emp) {
		emps = emp;
	}

	@Override
	public String toString() {
		return "TestDemo [ empId=" + empId + "]";
	}
	
	
}
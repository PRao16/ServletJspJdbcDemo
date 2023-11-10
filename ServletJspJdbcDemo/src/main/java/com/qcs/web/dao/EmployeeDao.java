package com.qcs.web.dao;
import java.sql.*;
import com.qcs.web.model.Employee;

public class EmployeeDao {
	
	public Employee getEmployee(int id) {
		Employee a = new Employee();
		a.setId(5);
		a.setFirst_name("Sweeta");
		a.setLast_name("Bhoopathi");
		a.setUsername("test");
		
		return a;
	}

}

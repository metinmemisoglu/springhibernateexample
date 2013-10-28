package com.memisoglu.learning.service;

import com.memisoglu.learning.model.Employee;

public interface EmployeeService {
	
	void persistEmployee(Employee employee);

	Employee findEmployeeById(String id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}

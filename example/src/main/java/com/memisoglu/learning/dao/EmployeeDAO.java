package com.memisoglu.learning.dao;

import com.memisoglu.learning.model.Employee;


public interface EmployeeDAO {
	
	  void persistEmployee(Employee employee);
	  
	  Employee findEmployeeById(String id);
	  
	  void updateEmployee(Employee employee);
	  
	  void deleteEmployee(Employee employee);
}

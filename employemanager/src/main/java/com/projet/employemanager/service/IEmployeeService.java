package com.projet.employemanager.service;

import java.util.List;

import com.projet.employemanager.model.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee e);
	public List<Employee>findAllEmployees();
	public Employee updateEmployee(Employee e);
	public void deleteEmployee(int id);
	public Employee findEmployeeById(Integer id);
	
}

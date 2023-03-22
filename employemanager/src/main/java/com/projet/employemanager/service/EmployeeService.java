package com.projet.employemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.employemanager.model.Employee;
import com.projet.employemanager.repository.EmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService{
	@Autowired
	EmployeeRepo er;
	
	
	@Override
		public Employee addEmployee(Employee e) {
			// TODO Auto-generated method stub
			return er.save(e);
		} 
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}

	
	@Override
	public Employee findEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return er.findById(id).get();
	}

	
}

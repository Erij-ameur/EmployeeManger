package com.projet.employemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.projet.employemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	//List<Employee> rechercherEmployeeMC(@Param("x") String mc);

}

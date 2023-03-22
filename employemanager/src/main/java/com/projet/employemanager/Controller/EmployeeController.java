package com.projet.employemanager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projet.employemanager.model.Employee;
import com.projet.employemanager.repository.EmployeeRepo;
import com.projet.employemanager.service.IEmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
	
	@Autowired
	IEmployeeService es;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> e= es.findAllEmployees();
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		Employee employee= es.findEmployeeById(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
		
	}
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		Employee newE= es.addEmployee(e);
		return new ResponseEntity<>(newE,HttpStatus.CREATED);
	
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e){
		Employee updatedE= es.updateEmployee(e);
		return new ResponseEntity<>(updatedE,HttpStatus.OK);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Integer id){
		es.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	

}

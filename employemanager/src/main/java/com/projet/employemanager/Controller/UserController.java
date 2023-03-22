package com.projet.employemanager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.employemanager.model.User;
import com.projet.employemanager.repository.UserRepo;
import com.projet.employemanager.service.IUserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor

public class UserController {
	@Autowired
	IUserService us;


	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> u=us.findAllUsers();
		return new ResponseEntity<>(u,HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> addUser(@RequestBody User u){
		User newU = us.addUser(u);
		return new ResponseEntity<>(newU,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<User> getEmployeeById(@PathVariable Integer id){
		User u= us.findUserById(id);
		return new ResponseEntity<>(u,HttpStatus.OK);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<?>UserLogin(@RequestBody User userData){
		User u =us.findUserByName(userData.getUsername());
		if(u.getUserPassword().equals(userData.getUserPassword()))
			return new ResponseEntity<>(u,HttpStatus.OK);
		else 
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	
	
}

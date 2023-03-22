package com.projet.employemanager.service;

import java.util.List;

import com.projet.employemanager.model.User;

public interface IUserService {
	
	public User addUser(User u);
	public User findUserById(Integer userId);
	public User findUserByName(String username);
	public List<User>findAllUsers();
	
	}

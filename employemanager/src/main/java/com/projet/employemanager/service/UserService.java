package com.projet.employemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.employemanager.model.User;
import com.projet.employemanager.repository.UserRepo;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepo ur; 

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return ur.save(u);
	}

	@Override
	public User findUserById(Integer userId) {
		// TODO Auto-generated method stub
		return ur.findById(userId).get();
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return ur.findByUsername(username);
	}

	



}

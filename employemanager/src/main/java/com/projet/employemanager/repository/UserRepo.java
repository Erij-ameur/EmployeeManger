package com.projet.employemanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.projet.employemanager.model.User;


public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
}

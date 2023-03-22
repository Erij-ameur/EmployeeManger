package com.projet.employemanager.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int userId ;
 private String username;
 private String userPassword;
}

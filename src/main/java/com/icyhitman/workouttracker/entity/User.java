package com.icyhitman.workouttracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id @GeneratedValue
	private long id;
	private String username;
	private String password;
	private String email;
}

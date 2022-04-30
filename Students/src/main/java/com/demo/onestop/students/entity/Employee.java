package com.demo.onestop.students.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Set<String> role;
	private String phone;
	private String email;
	@ManyToOne
	private Account account;
	@ManyToMany(mappedBy = "teacherId")
	private Class classes;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, Set<String> role, String phone, String email) {
		super();
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.email = email;
	}
	
	
}

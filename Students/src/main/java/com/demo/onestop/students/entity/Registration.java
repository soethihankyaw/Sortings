package com.demo.onestop.students.entity;

import java.sql.Date;
import java.util.Map;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date registerDate;
	private String status;
	private int fees;
	private int discount;
	private int paid;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Map<Integer, Student> students;
	@ManyToOne
	private Map<Integer, Class> classes;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(Date registerDate, String status, int fees, int discount, int paid) {
		super();
		this.registerDate = registerDate;
		this.status = status;
		this.fees = fees;
		this.discount = discount;
		this.paid = paid;
	}

}

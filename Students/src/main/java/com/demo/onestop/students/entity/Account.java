package com.demo.onestop.students.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userName;
	private String password;
	private int activated;
	private Date registerAt;
	private Date retiredAt;
	
	public Account() {
		super();

	}

	public Account(String userName, String password, int activated, Date registerAt, Date retiredAt) {
		super();
		this.userName = userName;
		this.password = password;
		this.activated = activated;
		this.registerAt = registerAt;
		this.retiredAt = retiredAt;
	}

}

package com.demo.onestop.students.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Course {

	@Id
	@Column(name = "code", nullable = false)
	private String code;
	private String name;
	private int hours;
	private String level;
	private int onlineFees;
	private int offlineFees;

	public Course(String name, int hours, String level, int onlineFees, int offlineFees) {
		super();
		this.name = name;
		this.hours = hours;
		this.level = level;
		this.onlineFees = onlineFees;
		this.offlineFees = offlineFees;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

}

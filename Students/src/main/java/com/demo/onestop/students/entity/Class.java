package com.demo.onestop.students.entity;

import java.sql.Time;
import java.util.Map;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String classType;
	private String startDate;
	private String months;
	private Time from;
	private Time to;
		
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Map<Integer, Employee> teacherId;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Course course;

	public Class() {
		super();
	}

	public Class(String classType, String startDate, String months, Time from, Time to) {
		super();
		this.classType = classType;
		this.startDate = startDate;
		this.months = months;
		this.from = from;
		this.to = to;
	}

}

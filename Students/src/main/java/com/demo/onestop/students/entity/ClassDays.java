package com.demo.onestop.students.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ClassDays {
	
	@Id
	@Column(name = "days_of_week", nullable = false)
	private String daysOfWeek;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Class classId;

	public ClassDays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassDays(String daysOfWeek) {
		super();
		this.daysOfWeek = daysOfWeek;
	}
	
	
}

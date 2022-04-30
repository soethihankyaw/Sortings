package com.demo.onestop.students.entity;

import java.util.Map;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Payments {

	@Id
	@Column(name = "paid_date", nullable = false)
	private Integer paidDate;
	private int toPaid;
	private int paidAmount;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Map<Integer, Registration> registrations;
	

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(Integer paidDate, int toPaid, int paidAmount) {
		super();
		this.paidDate = paidDate;
		this.toPaid = toPaid;
		this.paidAmount = paidAmount;
	}

}

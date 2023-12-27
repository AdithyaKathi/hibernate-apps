package com.abc.mypack2;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="job")
public class Job100 extends Employee100{
	
	@Column(name="salary")
	private int salary;
	@Column(name="designation")
	private String designation;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

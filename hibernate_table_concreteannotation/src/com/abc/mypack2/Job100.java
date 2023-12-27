package com.abc.mypack2;

import javax.persistence.*;

@Entity
@Table(name="jobx100")
@AttributeOverrides({@AttributeOverride(name="id",column=@Column(name="id")),@AttributeOverride(name="name",column=@Column(name="name"))})
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

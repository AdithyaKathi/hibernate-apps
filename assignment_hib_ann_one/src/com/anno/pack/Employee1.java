package com.anno.pack;

import javax.persistence.*;

@Entity
@Table(name="mytabz2000")
public class Employee1 {
	
	@Id
	private int empid;
	
	private String empname;
	private String empjob;
	private double empsal;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpjob() {
		return empjob;
	}
	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	
	
	
}

package com.abc.mypackage;

import javax.persistence.*;

@Entity
@Table(name="emp9900")
public class Employee188 {
	
	@Id
	private int id;       
	                                                     // POJO Class    OR     Persistent Object 
	private String firstName , lastName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

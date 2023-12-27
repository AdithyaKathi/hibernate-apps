package com.abc.mypack2;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="company")
public class Company100 extends Employee100{
	
	
	@Column(name="cname")
	private String cname;
	@Column(name="location")
	private String location;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}

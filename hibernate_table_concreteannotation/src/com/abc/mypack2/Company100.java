package com.abc.mypack2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="companyx100")
@AttributeOverrides({@AttributeOverride(name="id",column=@Column(name="id")),@AttributeOverride(name="name",column=@Column(name="name"))})

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

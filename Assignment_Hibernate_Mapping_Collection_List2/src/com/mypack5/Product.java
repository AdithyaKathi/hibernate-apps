package com.mypack5;

import java.util.*;

public class Product {
	
	private int pid;
	private String company;
	private double cost;
	
	private List<String> pnames;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<String> getPnames() {
		return pnames;
	}

	public void setPnames(List<String> pnames) {
		this.pnames = pnames;
	}
	
	
}

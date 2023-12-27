package com.mypack4;

import javax.persistence.*;

@Entity
@Table(name="branch1y100")
@PrimaryKeyJoinColumn(name="id1")
public class Branch1 extends College{
	
	@Column(name="bid")
	private int bid;
	
	@Column(name="bname")
	private String bname;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}

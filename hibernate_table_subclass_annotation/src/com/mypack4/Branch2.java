package com.mypack4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="branch2y100")
@PrimaryKeyJoinColumn(name="id1")

public class Branch2 extends College{
	
	
	@Column(name="bid2")
	private int bid2;
	
	@Column(name="bname2")
	private String bname2;
	
	public int getBid2() {
		return bid2;
	}
	
	public void setBid2(int bid2) {
		this.bid2 = bid2;
	}
	
	public String getBname2() {
		return bname2;
	}
	
	public void setBname2(String bname2) {
		this.bname2 = bname2;
	}
	
}

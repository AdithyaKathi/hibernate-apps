package com.mypack4;

import javax.persistence.*;

@Entity
@Table(name="collegeyy100")
@Inheritance(strategy=InheritanceType.JOINED)

public class College {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="cname")
	private String cname;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}

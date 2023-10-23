package com.hibernate.Assignment3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Capital")
public class Capital {
	@Id
	private int Id;
	
	@Column(name="Capita_Name")
	private String capitalName;
	
	public Capital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capital(int id, String capitalName) {
		super();
		Id = id;
		this.capitalName = capitalName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	
	

}

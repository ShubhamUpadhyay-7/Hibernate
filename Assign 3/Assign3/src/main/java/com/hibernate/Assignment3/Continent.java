package com.hibernate.Assignment3;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
@Table(name="Continent")
public class Continent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="Continent_Name")
	private String cname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Country_Id")
	private Map<Country,Capital> countries=new HashMap<>();

	public Continent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Continent(int id, String cname, Map<Country, Capital> countries) {
		super();
		Id = id;
		this.cname = cname;
		this.countries = countries;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Map<Country, Capital> getCountries() {
		return countries;
	}

	public void setCountries(Map<Country, Capital> countries) {
		this.countries = countries;
	}
}

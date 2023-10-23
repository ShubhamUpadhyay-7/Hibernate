package com.hibernate.Assignment4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="Car")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="RegNo",unique=true)
	private String RegNo;
	
	@Column(name="Model")
	private String Model;
	
	@Column(name="Colour")
	private String Colour;
	
	@Column(name="Manufacturer")
	private String Manufacturer;
	
	@Column(name="Price")
	private int Price;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String regNo, String model, String colour, String manufacturer, int price) {
		super();
		Id = id;
		RegNo = regNo;
		Model = model;
		Colour = colour;
		Manufacturer = manufacturer;
		Price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRegNo() {
		return RegNo;
	}

	public void setRegNo(String regNo) {
		RegNo = regNo;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Car [Id=" + Id + ", RegNo=" + RegNo + ", Model=" + Model + ", Colour=" + Colour + ", Manufacturer="
				+ Manufacturer + ", Price=" + Price + "]";
	}
	
}

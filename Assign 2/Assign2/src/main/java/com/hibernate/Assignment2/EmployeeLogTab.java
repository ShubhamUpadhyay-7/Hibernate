package com.hibernate.Assignment2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="EmployeeLogTab")
public class EmployeeLogTab {
	@Id
	@Column(name="EmpCode",nullable=false, unique=true)
	private int EmpCode;
	
	@Pattern(regexp="^[A-Z]*$")
	@Column(name="EmpName", nullable=false, unique=true)
	private String Name;
	
	@Pattern(regexp = "^(SE|SSE|SS|SSS)$")
	@Column(name="EmpDesignation",nullable=false,unique=true)
	private String Designation;
	
	@Min(6000)
	@Column(name="LastDrawnSalary",nullable=false,unique=true)
	private double LastDrawnSalary;
	
	@Column(name="LeavingDate", nullable=false, unique=true)
	private Date LeavingDate;

	public EmployeeLogTab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeLogTab(int empCode, String name, String designation, double lastDrawnSalary, Date leavingDate) {
		super();
		EmpCode = empCode;
		Name = name;
		Designation = designation;
		LastDrawnSalary = lastDrawnSalary;
		LeavingDate = leavingDate;
	}

	public int getEmpCode() {
		return EmpCode;
	}

	public void setEmpCode(int empCode) {
		EmpCode = empCode;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public double getLastDrawnSalary() {
		return LastDrawnSalary;
	}

	public void setLastDrawnSalary(double lastDrawnSalary) {
		LastDrawnSalary = lastDrawnSalary;
	}

	public Date getLeavingDate() {
		return LeavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		LeavingDate = leavingDate;
	}
}

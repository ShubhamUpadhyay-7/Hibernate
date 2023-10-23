package com.hibernate.Assignment2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmpCode")
	private int EmpCode;
	
	@Pattern(regexp="^[A-Z]*$")
	@Column(name="EmpName",length=50, nullable=false)
	private String EmpName;
	
	@Pattern(regexp="(SE|SSE|SS|SSS)$")
	@Column(name="EmpDesignation",nullable=false)
	private String EmpDesignation;
	
	
	@Column(name="EmpDOB",nullable=false)
	private Date EmpDOB;
	
	@Column(name="EmpJOD",nullable=false)
	private Date EmpJOD;
	
	@Min(18)
	@Max(60)
	@Column(name="EmpAge",nullable=false)
	private int EmpAge;
	
	@Min(6000)
	@Column(name="EmpBasic_Pay",nullable=false)
	private double EmpBasic_Pay;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empCode, String empName, String empDesignation, Date empDOB, Date empJOD, int empAge,
			double empBasic_Pay) {
		super();
		EmpCode = empCode;
		EmpName = empName;
		EmpDesignation = empDesignation;
		EmpDOB = empDOB;
		EmpJOD = empJOD;
		EmpAge = empAge;
		EmpBasic_Pay = empBasic_Pay;
	}

	public int getEmpCode() {
		return EmpCode;
	}

	public void setEmpCode(int empCode) {
		EmpCode = empCode;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpDesignation() {
		return EmpDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}

	public Date getEmpDOB() {
		return EmpDOB;
	}

	public void setEmpDOB(Date empDOB) {
		EmpDOB = empDOB;
	}

	public Date getEmpJOD() {
		return EmpJOD;
	}

	public void setEmpJOD(Date empJOD) {
		EmpJOD = empJOD;
	}

	public int getEmpAge() {
		return EmpAge;
	}

	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	public double getEmpBasic_Pay() {
		return EmpBasic_Pay;
	}

	public void setEmpBasic_Pay(double empBasic_Pay) {
		EmpBasic_Pay = empBasic_Pay;
	}

	@Override
	public String toString() {
		return "Employee [EmpCode=" + EmpCode + ", EmpName=" + EmpName + ", EmpDesignation=" + EmpDesignation
				+ ", EmpDOB=" + EmpDOB + ", EmpJOD=" + EmpJOD + ", EmpAge=" + EmpAge + ", EmpBasic_Pay=" + EmpBasic_Pay
				+ "]";
	}
	
	
}

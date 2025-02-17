package com.yedam;

import java.util.Date;

public class Employee {

	private String empNo;
	private String empName;
	private String telNo;
	private Date hireDate;
	private int salary;

	public Employee() {

	}

	public Employee(String empNo, String empName, String telNo, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.telNo = telNo;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

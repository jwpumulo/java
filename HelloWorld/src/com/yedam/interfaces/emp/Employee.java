package com.yedam.interfaces.emp;
/*
 * 사원번호 (1001, 1002)
 * 사원이름 (김지수, 김제니)
 * 전화번호 (654-1111, 654-222)
 * 입사일자 (2020-02-04)
 * 급여 (300, 350)
 * 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empNo;
	private String empName;
	private String telNo;
	private Date hireDate;
	private int salary;

	// 필드값을 생성하는 생성자
	public Employee() { // 기본생성자

	}

	public Employee(int empNo, String empName, String telNo) {
		this.empNo = empNo;
		this.empName = empName;
		this.telNo = telNo;
		this.hireDate = new Date(); // ctrl shift o
		this.salary = 250;

	}

	public Employee(int empNo, String empName, String telNo, String hireDate, int salary) {
		this(empNo, empName, telNo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.hireDate = sdf.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.salary = salary;
	}

	// 사번, 이름, 연락처, 급여

	public String empInfo() {

//		사번 이름 	연락처 	급여
//		------------------------
//		1001 김지수	888-0103 300
		return empNo + " " + empName + " " + telNo + " " + salary;

	}

	// getter setter

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
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

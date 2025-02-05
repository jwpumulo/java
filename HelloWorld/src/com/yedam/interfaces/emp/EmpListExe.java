package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용
 */

public class EmpListExe implements EmpDAO {
	// 필드

	List<Employee> empList = new ArrayList<Employee>(); // 저장공간 main.case1

	// 생성자
	public EmpListExe() {
		// 초기값
		empList.add(new Employee(1001, "김지수", "888-0103"));
		empList.add(new Employee(1002, "김제니", "888-0116"));
		empList.add(new Employee(1003, "박채영", "888-0212"));
		empList.add(new Employee(1004, "라리사", "888-0327", "2000-01-02", 500));

	}

	@Override
	public boolean registerEmp(Employee emp) {
		return empList.add(emp); // 등록 (add 커서 boolean)

	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int i = 0; i < empList.size(); i++) {

			// 사원번호 비교
			if (empList.get(i).getEmpNo() == emp.getEmpNo()) { // 공백이 아니면 변경

			}
			// 연락처 값이 "" 이 아닐때 변경.

			try {
				if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
					empList.get(i).setHireDate(emp.getHireDate());
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}

			if (emp.getSalary() != 0) {

				empList.get(i).setSalary(emp.getSalary());
			}

			return true;
		}

		return false;

	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == empNo) {
				empList.remove(i); // 삭제

				return true;
			}

		}
		return false;
	}

	@Override
	public Employee[] search(Employee emp) { // sal보다 급여가 많은 사람 조회
		// sal보다 급여가 많은 사람
		Employee[] result = new Employee[10];
		int idx = 0;

//		
//		for (int i = 0; i < empList.size(); i++) {
//			if (empList.get(i).getSalary() >= emp.getSalary()) {
//				result[idx] = empList.get(i);
//				idx++; // 0qn터 1씩 증가되도록
//
//			}
//
//		}

		for (int i = 0; i < empList.size(); i++) {
			// indexof
			if (empList.get(i).getEmpName().indexOf(emp.getEmpName()) != -1) {
				result[idx] = empList.get(i);
				idx++; // 0qn터 1씩 증가되도록

			}

		}

		return result;
	}

}

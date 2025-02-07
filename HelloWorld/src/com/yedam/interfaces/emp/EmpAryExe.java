package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 배열활용
 */

public class EmpAryExe implements EmpDAO {

	// employee객체를 담을 배열 저장공간
	Employee[] employees = new Employee[10];

	// 생성자
	public EmpAryExe() {

		employees[0] = new Employee(1001, "김지수", "111-0103");
		employees[1] = new Employee(1002, "김제니", "111-0116");
		employees[2] = new Employee(1003, "박채영", "111-0212");
		employees[3] = new Employee(1004, "라리사", "111-0327");

	}

	@Override
	public boolean registerEmp(Employee emp) {
		
		for (int i = 0; i< employees.length; i++) {
			//빈공간에 추가
			if (employees[i] == null ) {
				employees[i] == emp;
				return true;
			
			}
			

			
		}
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int i = 0; i < employees.length(); i++) {

			// 사원번호 비교
			if (employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) { // 공백이 아니면 변경

			}
			// 연락처 값이 "" 이 아닐때 변경.

			try {
				if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
					employees[i].setHireDate(emp.getHireDate());
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
//급여변경을 안할려고 엔터만 입력
			if (emp.getSalary() != 0) {

				employees[i].setSalary(emp.getSalary());
			}

			return true; // 정상수정
		}

		return false;// 수정못함

	}

	@Override
	public boolean removeEmp(int empNo) {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && //
					employees[i].getEmpNo() == empNo) {
				employees[i] = null;// 삭제

				return true;
			}

		}
		return false;

	}

	@Override
	public List<Employee> search(Employee emp) {

		List<Employee> result = new ArrayList<Employee>();
	//	int idx = 0;
		String name = emp.getEmpName();

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && //)
			
					employees[i].getEmpName().indexOf(name) > -1) {
				
				
				result.add
			}
			
			}

			// index of 사용
		
		return null;
	}

}

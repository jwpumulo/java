package com.yedam.interfaces.emp;

/*
 * 배열활용
 */

public class EmpAryExe implements EmpDAO {

	// employee객체를 담을 배열 저장공간
	Employee[] employees = new Employee[10];

	@Override
	public boolean registerEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		return null;
	}

}

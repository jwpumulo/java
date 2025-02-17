package com.yedam.interfaces.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpAryExe implements EmpDAO {

	Employee[] employees = new Employee[10];

	public EmpAryExe() {
		employees[0] = new Employee(1001, "김사원", "1111");
		employees[1] = new Employee(1002, "이대리", "2222");
		employees[2] = new Employee(1003, "박주임", "3333");
		employees[3] = new Employee(1004, "최사장", "4444", "2000-01-01", 500);
	}

	@Override
	public boolean registerEmp(Employee emp) {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = emp;
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) {

				if (!emp.getTelNo().equals("")) {
					employees[i].setTelNo(emp.getTelNo());
				}

				if (!sdf.format(emp.getHireDate()).equals("1900-01-01")) {
					employees[i].setHireDate(emp.getHireDate());
				}

				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpNo() == empNo) {
				employees[i] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		// TODO Auto-generated method stub-
		List<Employee> result = new ArrayList<Employee>();

//		for (int i = 0; i < empList.size(); i++) {
//			if (empList.get(i).getSalary() >= emp.getSalary()
//					&& (empList.get(i).getEmpName().indexOf(emp.getEmpName()) != -1)) {
//				result[idx] = empList.get(i);
//				idx++;
//			}
//		}

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null 
					&& employees[i].getEmpName().indexOf(emp.getEmpName()) != -1) {
				result.add(employees[i]);
			}
		}

		return result;
	}

}

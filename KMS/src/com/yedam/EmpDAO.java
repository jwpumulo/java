package com.yedam;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpDAO {

	List<Employee> storage = new ArrayList<>();

	public EmpDAO() {
		init();
	}

	public boolean registerEmp(Employee emp) {
		return storage.add(emp);
	}

	public List<Employee> empList() {
		return storage;
	}

	public boolean modifyEmp(Employee emp) {

		for (int i = 0; i < storage.size(); i++) {
			if (storage.get(i).getEmpNo().equals(emp.getEmpNo())) {
				storage.get(i).setSalary(emp.getSalary());
				return true;
			}
		}

		return false;
	}

	public boolean removeEmp(String empNo) {

		for (int i = 0; i < storage.size(); i++) {
			if (storage.get(i).getEmpNo().equals(empNo)) {
				storage.remove(i);
				return true;
			}
		}

		return false;
	}

	public List<Employee> searchEmp(Date hireDate) throws ParseException {

		List<Employee> result = new ArrayList<>();

		for (int i = 0; i < storage.size(); i++) {
			if (storage.get(i).getHireDate().after(hireDate) || storage.get(i).getHireDate().equals(hireDate)) {
				result.add(storage.get(i));
			}
		}

		return result;
	}

	// 빠른 테스트를 위해 임의의 초기값 입력
	private void init() {
		storage.add(new Employee("23-11", "김민성", "111-2222", new Date(), 200));
		storage.add(new Employee("23-12", "김민석", "222-3333", new Date(), 300));
		storage.add(new Employee("23-13", "김민식", "333-4444", new Date(), 400));
	}
}

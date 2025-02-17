package com.yedam.interfaces.emp;

import java.util.List;

public interface EmpDAO {

	boolean registerEmp(Employee emp);
	
	boolean modifyEmp(Employee emp);
	
	boolean removeEmp(int empNo);
	
	List<Employee> search(Employee emp);
	
}

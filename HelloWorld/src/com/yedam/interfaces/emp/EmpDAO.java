package com.yedam.interfaces.emp;

import java.util.List;

/*
 * 등록, 수정, 삭제, 조회
 */

public interface EmpDAO {
//사용할 메소드 이름 정하기 
	// 등록
	public boolean registerEmp(Employee emp); // 추상메소드 여기서는 정의만 구현은 인터페이스
	// 수정

	public boolean modifyEmp(Employee emp);

	// 삭제
	public boolean removeEmp(int empNo);

	// 조회
	public List<Employee> search(Employee emp);

}

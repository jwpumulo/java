package com.yedam.interfaces.emp;

import java.util.Scanner;

/*
 * 
 * 사원 관리 App. V1
 * 실행클래스: MainExe
 * 인터페이스 활용. (배열, 컬렉션)
 * Employee 클래스 이름 부서 입사날짜 연차 등
 * 배열EmpAryExe, 컬렉션EmpListExe, 인터페이스 활용EmpDAO
 *
 */

public class MainExe {

	public static void main(String[] args) {
		// 스캐너, run
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		// 배열, 컬렉션
		EmpDAO dao = new EmpListExe();

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 9.종료");
			System.out.print("선택>>");

			int menu = scn.nextInt();
			scn.nextLine();
			switch (menu) { // 컨트록하는 역할

			case 1: // 입력받기 > 사원번호 이름 전화번호
				System.out.println("사원번호>> ");
				int empNo = Integer.parseInt(scn.nextLine());
				System.out.println("이름>> ");
				String eName = scn.nextLine();
				System.out.println("전화번호>> ");
				String tel = scn.nextLine();

				if (dao.registerEmp(new Employee(empNo, eName, tel))) {// dao객체에 입력값 전달

					System.out.println("등록성공");
				}
				break; // end of case1

			case 2: // 수정 항목: 전화번호, 입사일자, 급여. +사원번호를 기준으로
				;
				System.out.println("사원번호>> ");
				empNo = Integer.parseInt(scn.nextLine());

				System.out.println("전화번호>> ");
				tel = scn.nextLine();

				System.out.println("입사일자>> ");
				String hdate = scn.nextLine();
				if (hdate.equals("")) {

					hdate = "1900-01-01"; // 엔터치고 넘어가면
				}

				System.out.println("급여>> ");
				String salString = scn.nextLine();
				if (salString.equals("")) { // 엔터치고 넘어가면.. 0인식.
					salString = "0";
				}

				int sal = Integer.parseInt(salString); // "10" > 10, "" > ?

				if (dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정완료");
				}

				break; // case 2종료.

			case 3: // 삭제 사원번호
				System.out.print("사원번호>> ");
				empNo = Integer.parseInt(scn.nextLine());

				if (dao.removeEmp(empNo)) {
					System.out.println("삭제완료");
				}
				break;

			case 4: // 목록
				// 조회조건 (급여 이상)

				Employee emp = new Employee();
				emp.setEmpName(eName);

				System.out.print("조회 급여조건>> ");
				sal = Integer.parseInt(scn.nextLine());
				System.out.print("조회 이름조건>> ");
				eName = scn.nextLine();

				emp.setSalary(sal);
				// 조회결과
				Employee[] result = dao.search(emp);
				// 출력
				System.out.println("사번  이름   연락처  급여");
				System.out.println("------------------------");

				for (Employee empl : result) {

					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}

			case 9:
				System.out.println("종료합니다");
				run = false;
				break;

			default:
				System.out.println("메뉴를 확인하세요");

			}

		}

		System.out.println("end of prog.");
	}// end of main

}
// end of class

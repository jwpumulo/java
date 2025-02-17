package com.yedam.interfaces.emp;

import java.util.List;
import java.util.Scanner;

public class MainExe {

//	static EmpDAO dao = new EmpListExe();
	static EmpDAO dao = new EmpDBExe();

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {

			System.out.println("=========================");
			System.out.println("1.등록 2.수정 3.삭제 4.조회 9.종료");
			System.out.print("선택 > ");
			int menu = 0;

			try {
				menu = scn.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("메뉴 다시 선택");
				scn.nextLine();
				continue;
			}

			scn.nextLine();

			switch (menu) {
			case 1:
				System.out.println("=========================");
				System.out.println("등록 시작");

				int no = 0;

				while (true) {
					try {
						System.out.print("사원번호 > ");
						no = Integer.parseInt(scn.nextLine());
						break;
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("사원번호 확인");
					}
				}

				System.out.print("이름 > ");
				String name = scn.nextLine();

				System.out.print("연락처 > ");
				String tel = scn.nextLine();

				if (dao.registerEmp(new Employee(no, name, tel))) {
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}

//				System.out.print("입사일자 > ");
//				String date = scn.nextLine();
//
//				System.out.print("월급 > ");
//				int salary = Integer.parseInt(scn.nextLine());

//				if (dao.registerEmp(new Employee(no, name, tel, date, salary))) {
//					System.out.println("등록 성공");
//				} else {
//					System.out.println("등록 실패");
//				}

				break;
			case 2:
				System.out.println("=========================");
				System.out.println("수정 시작");

				System.out.print("사원번호 > ");
				no = Integer.parseInt(scn.nextLine());

				System.out.print("연락처 > ");
				tel = scn.nextLine();

				System.out.print("입사일 > ");
				String date = scn.nextLine();

				if (date.equals("")) {
					date = "1900-01-01";
				}

				System.out.print("급여 > ");
				String salaryStr = scn.nextLine();
				int salary = 0;

				if (!salaryStr.equals("")) {
					salary = Integer.parseInt(salaryStr);
				}

				if (dao.modifyEmp(new Employee(no, null, tel, date, salary))) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

				break;
			case 3:
				try {
					remove();
					break;
				} catch (Exception e) {
					System.out.println("사원번호 확인");
				}
				break;
			case 4:
				System.out.println("=========================");
				System.out.println("조회 시작");

//				System.out.print("급여 > ");
//				salary = Integer.parseInt(scn.nextLine());

				System.out.print("이름 > ");
				name = scn.nextLine();

				Employee emp = new Employee();
//				emp.setSalary(salary);
				emp.setEmpName(name);

				List<Employee> result = dao.search(emp);

				System.out.println("사번  이름    연락처   급여");
				System.out.println("=========================");
				for (Employee emp1 : result) {
					System.out.println(emp1.empInfo());
				}
				break;
			case 9:
				run = false;
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴 선택 오류");
			}

		}

		System.out.print("End");
		scn.close();
	}

	static void remove() throws NumberFormatException {
		System.out.println("=========================");
		System.out.println("삭제 시작");

		System.out.print("사원번호 > ");
		int no = Integer.parseInt(scn.nextLine());

		if (dao.removeEmp(no)) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
}

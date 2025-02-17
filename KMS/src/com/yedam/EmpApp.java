package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {

		EmpDAO dao = new EmpDAO();

		Scanner scn = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		boolean run = true;

		while (run) {

			System.out.println("---------------------------------------------------------------");
			System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
			System.out.print("메뉴 선택>> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:

				System.out.print("사번입력>> ");
				String empNo = scn.nextLine();

				System.out.print("이름입력>> ");
				String empName = scn.nextLine();

				System.out.print("전화번호입력>> ");
				String telNo = scn.nextLine();

				System.out.print("입사일입력>> ");
				String hireDate = scn.nextLine();

				System.out.print("급여입력>> ");
				int salary = Integer.parseInt(scn.nextLine());

				try {

					Employee emp = new Employee();
					emp.setEmpNo(empNo);
					emp.setEmpName(empName);
					emp.setTelNo(telNo);
					emp.setHireDate(sdf.parse(hireDate));
					emp.setSalary(salary);

					if (dao.registerEmp(emp)) {
						System.out.println("등록 성공");
					} else {
						System.out.println("등록 실패");
					}

				} catch (ParseException e) {
					e.printStackTrace();
					System.out.println("날짜 형식 오류");
				}
				break;
			case 2:

				List<Employee> empList = dao.empList();

				if (empList.size() == 0) {
					System.out.println("사원 정보 없음");
				} else {
					// 수정 기능 확인을 위해 급여 항목 추가
					System.out.printf("%s  %s   %s %s\n", "사번", "이름", "전화번호", "급여");
					for (Employee item : empList) {
						System.out.printf("%s %s %s %d\n", item.getEmpNo(), item.getEmpName(), item.getTelNo(),
								item.getSalary());
					}
				}
				break;
			case 3:

				System.out.print("사번 급여>>");
				String empNoSalary = scn.nextLine();
				String[] empNoSalaryAry = empNoSalary.split(" ");
				salary = Integer.parseInt(empNoSalaryAry[1]);

				Employee emp = new Employee();
				emp.setEmpNo(empNoSalaryAry[0]);
				emp.setSalary(salary);

				if (dao.modifyEmp(emp)) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

				break;
			case 4:

				System.out.print("사번>>");
				empNo = scn.nextLine();

				if (dao.removeEmp(empNo)) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 5:

				System.out.print("입사일자>>");
				hireDate = scn.nextLine();

				try {
					empList = dao.searchEmp(sdf.parse(hireDate));

					if (empList.size() == 0) {
						System.out.println("사원 정보 없음");
					} else {
						System.out.printf("%s  %s   %s\n", "사번", "이름", "입사일자");
						for (Employee item : empList) {
							System.out.printf("%s %s %s\n", item.getEmpNo(), item.getEmpName(),
									sdf.format(item.getHireDate()));
						}
					}
				} catch (ParseException e) {
					e.printStackTrace();
					System.out.println("날짜 형식 오류");
				}
				break;
			case 6:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}

		}

		scn.close();

	}

}

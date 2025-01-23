package com.yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름, 연락처, 성별(남/여) -> 홍길동, 010-1234-2345, 남
 * 1.목록(이름, 연락처, 성별) 2.등록 3.조회(성별기준으로 조회기능) 4.삭제(이름) 5.수정(이름):연락처를 수정 9.종료
 * String [] friendAry 크기는 100개 ;
 */

public class todo3 {

	public static void main(String[] args) {

		boolean run = true; // true false 값을 담을 수 있게 boolean
		Scanner scn = new Scanner(System.in);
		// 정수를 담을 수 있는 배열
		String[][] friendAry = new String[100][3];

		friendAry[0] = new String[] { "김지수", "0103", "남" };
		friendAry[1] = new String[] { "김제니", "0116", "여" };
		friendAry[2] = new String[] { "박채영", "0212", "여" };
		friendAry[3] = new String[] { "라리사", "0327", "남" };

		while (run) {
			System.out.println("1.목록 2.등록 3.조회(성별) 4.삭제(이름) 5.연락처 수정 9.종료");
			System.out.print("메뉴 선택하세요> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록 출력
				System.out.println("------------------------------");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i][0] != null) {
						System.out.printf("이름: %s, 전화번호: %s, 성별: %s\n", friendAry[i][0], friendAry[i][1],
								friendAry[i][2]);
					}
				}
				System.out.println("------------------------------");
				break;

			case 2: // 입력
				System.out.println("이름을 입력>> ");
				String name = scn.nextLine();
				System.out.println("연락처를 입력>> ");
				String phone = scn.nextLine();
				System.out.println("성별을 입력>> ");
				String gender = scn.nextLine();

				// 등록하기
				for (int i = 0; i < friendAry.length; i++) {
					// 빈값을 판단하기
					if (friendAry[i] == null) { // 빈공간에 등록 후 반복문 종료
						System.out.println("i의 값[" + i + "]=>" + friendAry[i]);
						friendAry[i] = new String[] { name, phone, gender };
						break;
					}
				}
				break;

			case 3:
				System.out.println("조회할 성별 입력> 남or여");
//				String gender = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && gender.equals(friendAry[i][2])) {
						System.out.printf("이름: %s, 전화번호: %s, 성별: %s\n", friendAry[i][0], friendAry[i][1],
								friendAry[i][2]);
					}
				}
				break;

			case 4: // 삭제
				System.out.println("삭제할 정보를 입력하세요. (이름)");
				String name_remove = scn.nextLine();

				// 중복 이름 확인

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && name_remove.equals(friendAry[i][0])) {
						friendAry[i][0] = null;
						friendAry[i][1] = null;
						friendAry[i][2] = null;
					}
				}
				break;

			case 5: // 수정 (이름)
				System.out.println("수정할 대상의 정보를 입력하세요. (이름)");
				String name_edit = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && name_edit.equals(friendAry[i][0])) {
						System.out.println("수정할 정보를 입력하세요. (연락처)");
						String phone_edit = scn.nextLine();

						friendAry[i][1] = phone_edit;
					}
				}
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요");

			}// end of switch
		} // edn of while

	}// end of main

}// end of class

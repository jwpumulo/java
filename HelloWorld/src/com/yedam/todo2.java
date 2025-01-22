package com.yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름, 연락처, 성별(남/여) -> 홍길동, 010-1234-2345, 남
 * 1.목록(이름, 연락처, 성별) 2.등록 3.조회(성별기준으로 조회기능) 4.삭제(이름) 5.수정(이름):연락처를 수정 9.종료
 * String [] friendAry 크기는 100개 ;
 */
public class todo2 {

	public static void main(String[] args) {
		String[] studentAry = new String[100];
		boolean run = true; // true false 값을 담을 수 있게 boolean
		Scanner scn = new Scanner(System.in);
		// 정수를 담을 수 있는 배열
		int[] friendAry = new int[100]; // ?

		while (run) {
			System.out.println("1.목록 2.등록 3.조회(성별기준) 4.삭제(이름) 5.수정(이름) 9.종료");
			System.out.print("메뉴 선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록 출력

				break;

			case 2: // 등록 (이름, 연락처, 성별)
				System.out.println("이름, 연락처, 성별 값을 입력");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) { // 빈공간에 등록 후 반복문 종료
						friendAry[i] = scn.nextLine();
						break;
					}
				}
				break;

			case 3: // 조회 (성별기준)
				System.out.println("조회할 성별 입력");
			case 4: // 삭제 (이름)

			case 5: // 수정 (이름)

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

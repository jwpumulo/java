package com.yedam;

import java.util.Scanner;

public class forLoop3 {

	public static void main(String[] args) {

//		String[] infoAry = "지수,95".split(","); 이름 점수 분리가능
//		System.out.println(infoAry[0]); 이름
//		System.out.println(Integer.parseInt("80") * (Integer.parseInt("70")); 점수
//		String[] strAry = new String[10];
//		strAry[0] = "김제니";
//		String name = "박채영";
//
//		for (int i = 0; i < strAry.length; i++) {
//			if (strAry[i] == null) { // 빈공간에 등록 후 반복문 종료.
//				strAry[i] = name;
//				break;
//			}
//		}
//
//		for (int i = 0; i < strAry.length; i++) {
//			if (strAry[i] != null) {
//				System.out.println(strAry[i]);
//			}
//
//		}
		Scanner scn = new Scanner(System.in);
		System.out.println("이름 입력 >> ");
		String searchName = scn.nextLine();
		System.out.println("김지수".equals(searchName)); // 문자열 비교는 equals 비교연산자xx(==)

		String[] studentAry = new String[100]; // {"","",""}
		studentAry[0] = "김제니,90";
		studentAry[1] = "박채영,80";
		studentAry[2] = "라리사,70";

		boolean run = !true;

		while (run) {
			System.out.println("1.학생이름, 점수 2.최고점수 3.학생입력(한건씩) 4.점수 조회(이름) 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생 이름. 점수

				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름, 점수 값을 입력");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록완료!");

				break;

			case 2:// 최고점수출려ㅕㄱ
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {// 값이 있을 경우
						int temp = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < temp) {
							max = temp;
						}
					}
				}
				System.out.printf("최고점은 %d 입니다. \n", max);
				break;

			case 3:// 한건씩 입력하기
				System.out.println("이름, 점수 값을 입력");
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) { // 빈공간에 등록 후 반복문 종료
						studentAry[i] = scn.nextLine();
						break;
					}
				}
				break;
			
			
			case 4:// 이름 검색 후 점수 출력
				System.out.println("이름을 입력하세요");
				String searchName = scn.nextLine();
				f
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == ! null) { // 빈공간에 등록 후 반복문 종료
						if (studentAry[i].split(".")[0].equals(searchName)) {
							System.out printf("%s의 점수는 %s입니다. \n", 
									studentAry[i].split(".")[0],
									studentAry[i].split(".")[1]);
						
						break;//for구문
					}
						}
				}
		break;//스위치구문
				
				
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요");

			}

		} // end of while

		System.out.println("end of prog.");

	} // end of main
}
// end of class

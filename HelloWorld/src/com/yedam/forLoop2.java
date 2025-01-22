package com.yedam;

import java.util.Scanner;

public class forLoop2 {

	public static void main(String[] args) {

//		String[] infoAry = "지수,95".split(","); 이름 점수 분리가능
//		System.out.println(infoAry[0]); 이름
//		System.out.println(Integer.parseInt("80") * (Integer.parseInt("70")); 점수
		Scanner scn = new Scanner(System.in);

//		St0ring[] infoAry = "지수,95.103".split(","); 
//		System.out.println(infoAry[0]);
//		System.out.println(infoAry[1]);
//		System.out.println(infoAry[2]);

//		System.out.println("이름, 점수 값을 입력");
//		String userVal = scn.nextLine();
//		String[] infoAry = userVal.split(","); // 콤마를 기준으로 문자를 나눔
//		System.out.printf("이름은 %s이고 점수는 %s점입니다", infoAry[0], infoAry[1]);

		String[] studentAry = new String[3];
		boolean run = true;
		int[] scores = new int[3];

//		for (int i = 1; i < studentAry.length; i++) {
//			System.out.println(studentAry[i]); // "null" !=null
//		}

		while (run) {
			System.out.println("1.학생이름, 점수 2.최고점수 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생 3명의 이름과 점수를 입력하세요

				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름, 점수 값을 입력");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("입력완료");

				break;

			case 2:// 최고점수
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (max < Integer.parseInt(studentAry[i].split(",")[1])) {
						max = Integer.parseInt(studentAry[i].split(",")[1]);
					}
				}
				System.out.printf("최고점은 %d 입니다. \n", max);
				break;

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

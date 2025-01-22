package com.yedam;

import java.util.Scanner;

/* 
 * 학생점수 입력 받아서 배열 저장. > 스캐너. 배열 크키 선언
 * 최고점수, 평균, 합계 점수 출력. 
 */

public class ForLoopExe1 {

	public static void main(String[] args) {
		boolean run = true; // true false 값을 담을 수 있게 boolean
		Scanner scn = new Scanner(System.in);
		// 정수를 담을 수 있는 배열
		int[] scores = new int[3];

		while (run) {
			System.out.println("1.학생점수 입력 2.최고 점수 3.평균, 합계점수 5.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생점수입력
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수를 입력하세요.> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.println("입력완료");
				break; // break는 각각

			case 2: // 최고점 출력,
				int max = 0;
				// 반복문
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고점은 %d 입니다. \n", max);
				break;

			case 3: // 합계, 평균
				int sum = 0;
				double avg = 0; // 34.5555
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				// 32.2 더블타입
				avg = sum * 1.0 / scores.length; // int와 int의 연산결과는 int. }
				System.out.printf("합계는 %d, 평균은 %f 입니다. \n", sum, avg);

				break;

			case 4:
				break;
			case 5:
				System.out.println("프로그램 종료합니다.");
				run = false;
				// break; 마지막엔 break가 필요없음
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		} // end of while
		System.out.println("end of prog.");
	} // end of main
} // end of class

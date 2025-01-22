package com.yedam;

import java.util.Scanner;

// com.yedam.Todo 
public class todo1_2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in); // 시스템에 있는 기본 입력장치

		// 예금액. 잔액 54000 입금액 50000 입금금액이 10만원이 넘지 않도록 출금액은 마이너스 잔액이 되지 않도록
		// 10만원 초과: "초과금액입니다" -잔액: "잔액을 확인하세요"
		int balance = 0; // 예금액
		int money = 0; // 입금액, 출금액을 담아놓을 변수

		while (true) {
			System.out.println("1. 입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요>");
			int num = Integer.parseInt(scn.nextLine()); // 문자타입반환 > int변환

			if (num == 1) {// 입금. 잔액+입금액>100000 -> "금액초과입니다"
				System.out.print("입금액을 입력>");
				money = Integer.parseInt(scn.nextLine());
				
				if (balance + money > 100000) {
					System.out.println("금액초과입니다");
				} else {
					balance += money; 
					System.out.println("입금완료);
				}
				
			} else if (num == 2) { // 출금. 잔액-출금액<0 -> "잔액을 확인하세요"
				System.out.print("출금액을 입력> ");
				money = Integer.parseInt(scn.nextLine());
				
				if (balance < money ) {
					System.out.println("잔액을 확인하세요");
				} else {
					balance -= money; 
					System.out.println("출금완료);
				}
				
			} else if (num == 3) { // 잔액조회
				System.out.printf("현재 잔액은 %d입니다. \n", balance);
				
				
			} else if (num == 4) { // 종료
				System.out.printf("잔액은>");

			}
			System.out.printf("입력한 값은 %s\n", num);
			break;
		}
	}
}
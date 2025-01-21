package com.yedam;

import java.util.Scanner;

public class todo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in); // 시스템에 있는 기본 입력장치
//ctrl+shift+o
	
		
		while (true) {
			System.out.println("1. 입금 2.출금 3.잔액조회 4.종료");
		 //num = scn.nextLine(); 
			
			System.out.print('메뉴를 선택하세요>")
			
			
		 int num = Integer.parseInt(scn.nextLine()); // 문자타입반환 > int반환
		
		if (num == 1) {//입금
			System.out.print('입금액을 입력>")
			balance = Interger.parseInt(scn.nextLine());
		}
		
		} else if(num==2) { //출금
			
			
			
		}else if(num==3) { //잔액조회
			
			System.out.printf("현재 잔액은 %d입니다. \n, balance")
		}		else if(num==4) { //종료
		
		
		}
		 
		System.out.printf("입력한 값은 %s\n", num);

	}
}

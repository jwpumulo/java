package com.yedam.reference;

import java.util.Scanner;

public class ReferenceExe3 {

	public static void main(String[] args) {
		exe();

	}// end of main\\\\\\\

	public static void exe() {

		Scanner scn = new Scanner(System.in);
		// 이름, 연락처, 성별 => 100개 공간 생성
		String[][] friends = new String[100][3]; // 행열
		friends[0][0] = "홍길동";
		friends[0][1] = "010-0000-0103";
		friends[0][2] = "남";
		friends[1] = new String[] { "김민수", "010-000-0116", "남" };

		System.out.println("이름을 입력>> ");
		String name = scn.nextLine();
		System.out.println("연락처를 입력>> ");
		String phone = scn.nextLine();
		System.out.println("성별을 입력>> ");
		String gender = scn.nextLine();

//		friends[2][0] = name;
//		friends[2][1] = phone;
//		friends[2][2] = gender;
		friends[2] = new String[] { name, phone, gender };

// 		friends[5] = {null, null, null};
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i][0] != null) {
				System.out.printf("이름은 %s, 연락처는 %s\n", friends[i][0], friends[i][1]);
			}
		}

//		String[][] nameScore = new String[5][2]; // 문자열 String
//		String[][] nameScore = { { "홍길동", "80" }, { "김민수", "85" }, { "박헌수", "88" }, { "심상현", "90" }, { "최기동", "75" }, };

	}

}// end of class

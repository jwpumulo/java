package com.yedam.reference;

public class ReferenceExe2 {

	public static void main(String[] args) {
		// 배열선언.

//		String[][] nameScore = new String[5][2]; // 문자열 String
		String[][] nameScore = { { "홍길동", "80" }, { "김민수", "85" }, { "박헌수", "88" }, { "심상현", "90" }, { "최기동", "75" }, };

//		nameScore[0][0] = "홍길동";
//		nameScore[0][1] = "80"; // 문자열 ""
//
//		nameScore[1] = new String[] { "김민수", "85" };
//		nameScore[1][0] = "김민수";
//		nameScore[1][1] = "85";
//
//		nameScore[2][0] = "박헌수";
//		nameScore[2][1] = "88";
//
//		nameScore[3][0] = "심상현";
//		nameScore[3][1] = "90";
//
//		nameScore[4][0] = "최기동";
//		nameScore[4][1] = "75";

//		for (int j = 0; j < nameScore.length; j++) { // int
//			for (int i = 0; i < nameScore[0].length; i++) {
//				System.out.println("nameScore[" + j + "][" + i + "]=>" + nameScore[j][i]);
//			}
//		}

		int sum = 0;

		String[] temp = { "", "0" }; // 문자열 "0"

		for (int i = 0; i < nameScore.length; i++) {
			System.out.println("점수는" + nameScore[i][1]); // sum에 값을 누적
			sum = sum + Integer.parseInt(nameScore[i][1]); // 최고점수를 받은 학생

			if (Integer.parseInt(temp[1]) < Integer.parseInt(nameScore[i][1])) { // 클래스 안의 메서드
				temp = nameScore[i];
			}

		}
		System.out.printf("sum의 값은 %d\n", sum);
		System.out.printf("최고점 학생은 %s\n", temp[0]);

	}// end of main
}// end of class

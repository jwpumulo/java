package com.yedam.reference;

import java.util.Scanner;

public class StudentExe {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Student[] students = new Student[5]; // 학생정보

		Student std1 = new Student("김제니", 80, 85); // 인스턴스 생성
		// std1.studentName = "김제니";
		// std1.engScore = 80;
		// std1.mathScore = 85;

		Student std2 = new Student();
		std2.studentName = "박채영";
		std2.engScore = 85;
		std2.mathScore = 88;

		Student std3 = new Student();
		std3.studentName = "라리사";
		std3.engScore = 75;
		std3.mathScore = 90;

		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김지수", 95, 13);

//	학생의 이름을 입력받는 변수 studName 
//	학생의 평균을 출력하는 프로그램을 작성

		System.out.println("학생의 이름을 입력하세요>");
		String studName = scn.nextLine();

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].studentName.equals(studName)) {
				System.out.printf("학생의 평균은 %.2f입니다.\n", students[i].getAverage());
			}

		}

//	학생의 평균을 출력하는 프로그램을 작성

//		System.out.println(students[0] instanceof Student);

		for (

				int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getAverage() >= 80) {
				students[i].printInfo();
			}

// 			if (students[i] != null && students[i].engScore >= 80) {
//				students[i].printInfo();
//			

		}

	}// end of main

}
// end of class
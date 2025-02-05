package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.reference.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3)Map 4)
 * 
 */
public class Exe {

//	public static void main(String[] args) {
//		String[] strAry = new String[10]; // 배열
//		List<String> strList = new ArrayList<String>(); // 컬렉션.
//		List<Friend> friends = new ArrayList<Friend>(); // 컬렉션.
//
//		friends.add(new Friend("김제니", "010-0116-2222"));
//		friends.add(new ComFriend("박채영", "010-0212-3333", "우리은행"));
//
//		friends.remove(new Friend("김제니", "010-0116-2222"));
//		System.out.println("friends크기: " + friends.size());
//
//		System.out.println(friends.get(1)); // 두번째 위치 객체반환
//
//		// 추가
//		strList.add("안녕하세요");
//		strList.add("Hello");
//		strList.add("반갑습니다");
//		System.out.println("strList크기: " + strList.size());
//
//		// 삭제
//		strList.remove(0);
//		strList.remove("Hello");
//
//		for (int i = 0; i < strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
//	}

	public static void main(String[] args) {
		System.out.println("김지수".indexOf("지수")); // -1보다 큰 값
		System.out.println("김지수".indexOf("수")); // -1보다 큰 값

		// 학생 정보를 저장하는 컬렉션 (ArrayList) 선언.

		String[] strAry = new String[10];
		List<String> strList = new ArrayList<String>(); // 컬렉션.
		List<Student> students = new ArrayList<Student>(); // 컬렉션.

		// 3명 추가
		students.add(new Student("김지수", 80, 90));
		students.add(new Student("김제니", 65, 80));
		students.add(new Student("박채영", 50, 70));

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentName().equals("김제니")) {
				// students[i]
				students.remove(i);
				break;
			}

		}

		// 출력
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printInfo();
		}

		// 이름만 출력

	}

}

//add remove get 첫번째0
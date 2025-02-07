package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
//문제호출

	static void 연습() {
		String str = "hello";
		String str1 = "world";
		StringUtil 연결하기(str.str1);

	}

	static void no1() { // replace,charat

		String ssn1 = "9999991685444";
		String ssn2 = "021112 1341234";
		String ssn3 = "021112-3341234";// 8번째 값이
		
		StringUtil.checkGender(ssn1);
		StringUtil.checkGender(ssn2);
		StringUtil.checkGender(ssn3);

	}

	static void no2() { // indexof, substring
		//파일경로와 파일명
	}
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringUtil.checkExtension(file1);

	}

	static void no3() { // trim
		// 문자의 갯수를 반환
		String str1 = " suggest ";
		String str2 = " currently ";
		String str3 = " particular ";
		StringUtil.getLength(str3);

	}

}

package com.yedam.api;

public class StringUtil {

	static void 연결하기 (String str, String str2) {
	//문자를 연결하는ㄴ 메소느 "" + "" + ""
		System.out.println(str.concat(",").concat(",")

}

	static void checkGender(String ssn) { // charAt
	// 성별을 출력. "남자입니다" 또는 여자입니다
		//번호의 길이를 구분해서 13또는 14일 경우 
		
		int pos = 6;
		if (ssn.length() ==14) {
			pos = 7; 
		
		}
		
		char chr = ssn.charAt(pos); // 찾고자 하는 위치의 문제

		
		switch (chr) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
			defalut:
		}

	static void checkExtension(String file) {

		// 파일의 확장자는 jpg (또는 mp3, hwp) 입니다
	String ext = file.substring(file.indexOf(".")) + 1); 
		System.out.println("파일의 확장자는 %s 입니다.", );
		
		

	}

	static void getLength(String str) {
	//문자의 길이는 7자입니다
		//String str1 = str.trim();
		int len = str1.trim().length()	;
		System.out.println("문장의 길이는 %d 글자입니다.", );

	}

//end of stringuil
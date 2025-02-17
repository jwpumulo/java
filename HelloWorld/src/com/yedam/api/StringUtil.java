package com.yedam.api;

import java.time.LocalDateTime;

public class StringUtil {

	static void checkGender(String str) {

		String strEdit = str.replace(" ", "").replace("-", "");

		char charGender = strEdit.charAt(6);

		switch (charGender) {
		case '1':
		case '3':
			System.out.println("남자임");
			break;
		case '2':
		case '4':
			System.out.println("여자임");
			break;
		default:
			System.out.println("뭐임?");
		}
	}

	static void checkExtension(String str) {

//		String[] strAry = str.split("\\.");

		int idx = str.indexOf(".");

//		System.out.printf("%s의 확장자는 %s\n", str, strAry[1]);
		System.out.printf("%s 파일의 확장자는 %s\n", str, str.substring(idx + 1));
	}

	static void getLength(String str) {

		String strEdit = str.trim();

		System.out.printf("%s 문자열은 %d글자\n", strEdit, strEdit.length());
	}
}

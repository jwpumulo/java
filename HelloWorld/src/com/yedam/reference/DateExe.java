package com.yedam.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {

		// Date 기능
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 연도만 출력
		Date now = new Date();
		System.out.println(sdf.format(now)); // 포맷 메소드 안에
		// 년도-월-일 시:분:초

		try {// 예외가 발생하더라도 캐치 구문을 실행하고 정상 종료.
			now = sdf.parse("2024-12-25 12:00:00"); // parse구문은 예외처리 안하면 에러남
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("end of prog.");
	}

}

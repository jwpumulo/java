package com.yedam.api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance(); // 인스턴스
		today.set(Calendar, YEAR, 2024); // 필드: 값
		today.set(2024, 1, 10); // 2024 2 10으로 지정

		int year = today.get(Calendar.YEAR); // 1,2,3
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = today.getActualMaximum(Calendar.DATE);

		System.out.printf("%d년 %d월 %d일 %d요일", year, month + 1, date, day); // 상수호출 YEAR1 MONTH2

		System.out.println("말일은 " + dayOfMonth);

	}

}

package com.yedam.reference;

public class Calculator_Cal {

	public void showCalendar() {
//1월달 출력.
		
		int spaces =3;
		int lastDate = 31;
		
		
	String[] dateAry - new String[spaces + lastDate];

	
	for (int i = 0; i < dateAry.length; i++) {
		
		if (i < spaces)
	 {
		dateAry[i] = "";
		
		
	} else {
	dateAry[i] = ""+ (i + 1 -spaces)	;
	
	}
	}
		
		
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (String day : days) {
			System.out.printf("%4s", day);

		}
		System.out.println("\n------------------------------------------------");
		// 공백, 말일 계산
	}

	int empty = 3;
	int max = 31;

	for(
	int i = 0;i<max+empty;i++)
	{
		if (i < empty) {
			System.out.printf("%4s", " ");
		} else if ((i + 1) / 7 == 0) {
			System.out.printf("%4d\n", i + 1 - empty);
		} else {
			System.out.printf("%4d\n", i + 1 - empty);

		}

	}

}// end of class

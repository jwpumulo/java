package com.yedam.api;

public class StringExe {

	public static void main(String[] args) {
		String str = new String(new byte[] { 72, 101, 108, 108, 111 });

		System.out.println(str);

		byte[] result = str.getBytes();

		for (byte item : result) {
			System.out.println(item);
		}

		System.out.println(str.charAt(1));

		String ssn = "050409-3555885";
		char chr = ssn.charAt(7);
		switch (chr) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
			default:
				System.out.println("?");
				
		}

	}
}

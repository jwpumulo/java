package com.yedam.reference;

public class Calculator {

	// 매개값, 반환값
// 183
//	*
//	**\
//	***\
//	****

	public Book getBookInfo(String btitle, Book[] bookAry) {// {북 인스턴스 4개
//		Book[] bookRepo = { new Book("소년이 온다", "한강", "창비", 15000), new Book("초역 부처의 말", "코이케류노스케", "포레스트북스", 17800),
//				new Book("작별하지 않는", "한", "문학동", 16800), new Book("이처럼 사소한 것들", "홍한", "다산책방", 13800)
//
//		};
//배열에서 검색
		for (int i = 0; i < bookAry.length; i++) {
			if (bookAry[i].getBookTitle().equals(btitle)) { // 제목
				return bookAry[i]; // price는 string에서 int로
			}
		}
		return null; // -1 null의 차이는?
	}

	public boolean getBookInfo(String btitle) {// 북 인스턴스 4개
		Book[] bookRepo = { new Book("소년이 온다", "한강", "창비", 15000), new Book("초역 부처의 말", "코이케류노스케", "포레스트북스", 17800),
				new Book("작별하지 않는", "한", "문학동", 16800), new Book("이처럼 사소한 것들", "홍한", "다산책방", 13800)

		};
//배열에서 검색
		for (int i = 0; i < bookRepo.length; i++) {
			if (bookRepo[i].getBookTitle().equals(btitle)) { // 제목
				return bookRepo[i]; // price는 string에서 int로
			}
		}
		return null;
	}

	// 1~100 사이의 임의값을 n개 반환.
	public int[] randomAry(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * 100) + 1;

		}
		return result;
	}

	public void printStar(int times) { // 매개변수 types
		for (int i = 1; i <= times; i++) {
			printStar(i, "*");
			System.out.println();

//			System.out.println("*");
//			System.out.println("**");
//			System.out.println("***");
//			System.out.println("****");
		}
	}

	// 별 출력하는 메소드
	public void printStar(int times, String types) { // 매개변수 types
		for (int i = 1; i <= times; i++) {
			System.out.print(types);
		}
	}

	// 두 숫자 중에서 큰 값을 반환
	public int getMax(int num1, int num2) {

		return num1 > num2 ? num1 : num2;
	}

	// 두수의 합을 반환하는 메소드

	public int sum(int num1, int num2) {

		if (num1 > num2) { // return num1 > num2 ? num1 : num2;
			return num1;
		} else {
			return num2;
		}

	}

	// 동일한 메소드명을 중복정의: overloading
	public double sum(double num1, double num2)

	{
		return num1 + num2;

	}

	public int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];

		}

		return sum;

	}
//
//	public int sum(ary1[] intAry1) {
//		int sum = 0;
//		for (int i = 0; i < intAry.length; i++) {
//			sum += intAry[i];
//
//		}
//
//		return sum;
//
//	}

	public static void main(String[] args) {
		System.out.println("------------------------------");
	}

}// end of class

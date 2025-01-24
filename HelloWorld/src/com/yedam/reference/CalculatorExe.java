package com.yedam.reference;

public class CalculatorExe {

	public static void main(String[] args) {

		Book[] bookStore = { new Book("소년이 온다", "한강", "창비", 15000), new Book("초역 부처의 말", "코이케류노스케", "포레스트북스", 17800),
				new Book("작별하지 않는", "한", "문학동", 16800), new Book("이처럼 사소한 것들", "홍한", "다산책방", 13800) };

		Calculator cal = new Calculator();

		Book author = cal.getBookInfo("소년이 온다", bookStore);
		if (author != null) {
			author.showDetailInfo();
		} else {
			System.out.println("조회결과 없음");
		}

		int[] randomA = cal.randomAry(5);
		for (int num : randomA) {
			System.out.println(num);
		}
		System.out.println(cal.sum(randomA));
//
//		int[] ary1 = { 14, 23, 11, 14, 24 };
//		int[] ary2 = { 33, 23, 6, 12, 9 };

//		System.out.println(cal.getMax(ary1, ary2));
//		int max = cal.getMax(cal.sum(ary1), cal.sum(ary2));
//		System.out.println("배열의 합이 큰 값은" + max);

//		cal.printStar(5);
//		cal.printStar(3, "※"); // 매개값

		double n1 = 10.5;
		double n2 = 20.5;
		double result = cal.sum(n1, n2);

		// double> float> long> int > short > byte

		result = cal.sum(new int[] { 10, 20, 30, 40 });

		System.out.println("결과: " + result);

	}

}// end of class

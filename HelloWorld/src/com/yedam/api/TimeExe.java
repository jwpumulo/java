package com.yedam.api;

//public class TimeExe {

//	public static void main(String[] args) {
//
//		// ?분 ?초 합은 ? 입니다. 출력
//		// 1부터 100000000000까지 짝수합을 구하는 시간
//
//		long evenSum = 0;
//		long max = 10000000000l; // long 타입 알려줘야함
//
//		for (int i = 0; i < max; i++) {
//			if ((i + 1) % 2 == 0) {
//				evenSum = evenSum + (i + 1);
//			}
//
//			System.out.println("1부터 10000000000까지의 짝수의 합은 " + evenSum + " 입니다.\n");
//		}
//	}
//}

public class TimeExe {
	public static void main(String[] args) {
		
		long time1=System.nanoTime();
		
		int sum = 0;
		for (int i =1; i<=100000000000; i++) {
			if ((i + 1) % 2 == 0) {
		sum = sum + (i + 1);
	}

	System.out.println("1부터 10000000000까지의 짝수의 합은 " + evenSum + " 입니다.\n");
		}
		
		
		
		
		
		
	}

// ?분 ?초 합은 ? 입니다. 출력
// 1부터 100000000000까지 250의 배수의 합을 구하는 시간

//		System.currentTimeMillis();
//		long n = 2147483648;
//
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//
//}
//
//void test();

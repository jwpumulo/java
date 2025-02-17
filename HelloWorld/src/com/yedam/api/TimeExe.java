package com.yedam.api;

import java.time.LocalDateTime;

public class TimeExe {
	public static void main(String[] args) {

		// 1-100000000 짝수 합을 구하는 시간.
		// 시,분,초

		long start = System.currentTimeMillis();
		
		long sum = 0;
		long max = 10000000000l;

		for (long i = 0; i <= max; i++) {
			if (i % 10 == 0) {
				sum += i;
			}
		}

		long end = System.currentTimeMillis();
		
		System.out.println(end - start);

		long time = (end - start) / 1000;

//		long hour = time / (60 * 60);
//		long min = time % (60 * 60) / 60;
//		long sec = time % 60;

		long hour = time / (60 * 60);
		long min = time % (60 * 60) / 60;
		long sec = time % 60;
		
		System.out.println(sum);
		System.out.printf("합: %d 소요시간 : %d시 %d분 %d초", sum, hour, min, sec);
	}
}

package com.yedam;

public class Variable {

//	public static void main(String[] args) {
//
//		for (int j = 2; j <= 7; j++) {
//
//			int num = j;
//			for (int i = 1; i <= 9; i++) {
//				// System.out.println(num + "*" + i + "=" + num * i);
//				System.out.printf("%d * %d = %d\n", num, i, num * i); // `${num}*${i}=${num*i}
//			}
//
//		}
//		System.out.println("end of prog");
//	}
//}


	
	// 6번째에서 아래로 

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {

			// int num = j;
			for (int i = 2; i <= 6; i++) {
				// System.out.println(num + "*" + i + "=" + num * i);
				System.out.printf("%3d * %3d = %3d", i, j, i * j); // `${num}*${i}=${num*i}
			}
			System.out.println();
		}
		System.out.println("end of prog");
	}
}
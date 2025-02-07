package com.yedam.stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileExe {

	public static void main(String[] args) {

		// 문자기반 출력 ListExe.java 읽기
		char txt;
		try {
			Reader reader = new FileReader("c:/temp/ListExe.java");
			while (true) {
				int chr = reader.read(); // char(2byte)
				System.out.print((char) chr); // 65 > A
				if (chr == -1) {
					break;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");

	}
}
//		
//		문자기반 파일출력
//		try {
//			Writer wr = new FileWriter("c:/temp/test2.txt");
//			wr.write(65); // 매개값
//			wr.write(new char[] { 'b', 'c' }); // 매개값
//			wr.write("DEJHGYJJ", 2, 3); // 매개값
//
//			wr.flush();
//			wr.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("end of prog");
//
//	}
//	
//	
//}
//		
//		
//		
//		
//		
//		
//
//		// c:temp/sample_01.PNG > c:temp/copy.PNG생성
//
//		try {
//			InputStream is = new FileInputStream("c:temp/sample_01.PNG");
//			OutputStream os = new FileOutputStream("c:temp/copy.PNG");
//
//			int data = -1;
//			byte[] buf = new byte[100];
//
//			while (true) {
//				// 읽기
//				data = is.read(buf); // -1 더이상 읽지 못하면 반환
//
//				os.write(data); // 출력 ( 바이트 쓰기)
//
//				if (data == -1) {
//					break;
//
//				}
//
//			}
//
//			is.close();
//			os.flush();
//			os.close();
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
////		try {
////			InputStream is = new FileInputStream("c:/temp/test1.dat");
////			while (true) {
////				int date = is.read(); // 바이트 읽고 반환 -1값 반환
////				System.out.println(date);
////				if (date == -1) {
////					break;
////				}
////			}
////			is.close();
////
////		} catch (IOException e) {
////			e.printStackTrace();
////
////		
//		
//	
//	
//	}
//	
//	void copy()
//		
//	
//	
//	
//		
//
//		System.out.println("end of prog");
//
//	}
//}
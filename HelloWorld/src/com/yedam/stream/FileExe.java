package com.yedam.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileExe {

	public static void main(String[] args) {

		try {
			Reader reader = new FileReader("C:/temp/ListExe.java");
//			Writer writer = new FileWriter("C:/temp/ListExeCopy.java");
			
			int data = -1;
			
			while (true) {
			
				data = reader.read();
				System.out.print((char) data);
				
//				char[] buf = new char[100];
//
//				data = reader.read(buf);
//				System.out.print(buf);
				
//				writer.write(buf);
				
				if (data == -1) {
					break;
				}
			}
			
			reader.close();
//			writer.flush();
//			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		output();
//		input();
//		copy();
		System.out.println("eop");
	}

	static void output() {
		try {
			OutputStream os = new FileOutputStream("C:/temp/test1.dat");

			os.write(10);
			os.write(20);
			os.write(30);

			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void input() {
		try {
			InputStream is = new FileInputStream("C:/temp/test1.dat");

			while (true) {

				int data = is.read();
				System.out.println(data);

				if (data == -1) {
					break;
				}
			}

			is.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void copy() {
		try {
			InputStream is = new FileInputStream("C:/temp/ex1.jpg");
			OutputStream os = new FileOutputStream("C:/temp/copy3.jpg");

			int data = -1;
			while (true) {

				byte[] buf = new byte[100];

				data = is.read(buf);
				System.out.println(data);

				os.write(buf);

				if (data == -1) {
					break;
				}
			}
			is.close();
			os.flush();
			os.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			InputStream is = new FileInputStream("C:/temp/mcpc.jpg");
//			OutputStream os = new FileOutputStream("C:/temp/copy.jpg");
//
//			int data = -1;
//			while (true) {
//
//				data = is.read();
//				System.out.println(data);
//				
//				os.write(data);
//
//				if (data == -1) {
//					break;
//				}
//			}
//			is.close();
//			os.flush();
//			os.close();
//			
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	static void writer() {
		try {
			Writer writer = new FileWriter("C:/temp/test2.txt");

			writer.write(65);
			writer.write('A');
			writer.write("난너를믿었던만큼\n내친구도믿었기에", 3, 8);
			writer.write(new char[] { 'B', 'C' });

			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

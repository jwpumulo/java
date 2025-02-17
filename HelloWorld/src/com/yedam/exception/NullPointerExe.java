package com.yedam.exception;

import com.yedam.reference.Student;

public class NullPointerExe {
	public static void main(String[] args) {
		Student student = null;
		
		String[] strAry = {"a", "b"};
		
		int a = 0;
		
		try {
			a = Integer.parseInt("a");
			strAry[2] = "c";
			student.getStudentName();
		} catch (NullPointerException 
				| ArrayIndexOutOfBoundsException
				| NumberFormatException e) {
			System.out.println("null or array or number?");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("runtime?");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("exception?");
			e.printStackTrace();
		}
	}
}

package com.yedam.api;

public class MemberExe {

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));

		Member m1 = new Member();
		Member m2 = new Member();

		m1.memberId = "aa";
		m1.memPoint = 80;
		m2.memberId = "aa";
		m2.memPoint = 90;

//		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
	}

}

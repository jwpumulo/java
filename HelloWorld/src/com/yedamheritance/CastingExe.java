package com.yedamheritance;

public class CastingExe {
	public static void main(String[] args) {

		// byte <short < int < long
		int n1 = 100;
		long n2 = 0;
		n1 = (int) n2; // casting 강제로 하는 것
		n2 = n1; // promotion
		
		
		//Object < friend < ComFriend < Uni

		Friend f1 = new ComFriend("", "", "", ""); // promotion
		ComFriend f2 = (ComFriend) new Friend("", ""); // casting

		f1 = new Friend("","");
		if (f1 instaceof ComFriend) {
		ComFriend f2 = (ComFriend) f1;
System.out.println(f2.showInfo());} else {System.out.println("형변환 못함");
	
	
	
	
	
}




		System.out.println(f2.showInfo());

	}
}

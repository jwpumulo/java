package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class HashExe {
	public static void main(String[] args) {
		
		// hashCode(), equals() 로 비교
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("01", 100));
		set.add(new Member("02", 200));
		set.add(new Member("01", 100));
		
		for (Member mem : set) {
			System.out.println(mem.memberId + ", " + mem.memPoint);
			System.out.println(mem);
			System.out.println(mem.toString());
		}
	}

}

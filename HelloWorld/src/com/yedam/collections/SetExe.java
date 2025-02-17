package com.yedam.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("홍");
		set.add(null);
		set.add("길");
		set.add("100");
		set.add(String.valueOf(true));
		
		Iterator<String> iter = set.iterator();
		
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (String item : set) {
			System.out.println(item);
		}
	}
}

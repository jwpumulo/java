package com.yedam.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExe {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		List objList = new ArrayList();
		
		strList.add(null);
		strList.add("H");
		strList.add(new String("KD"));
		strList.add(new String(new byte[] {72, 101, 108, 108, 111}));
		
		strList.remove(0);
		strList.size();
		
		strList.add(0, "Hello");
		
		for (String item: strList) {
			System.out.println(item);
		}
		
		System.out.println(strList.contains("H"));
	}
	
}

package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍", 90);
		map.put("김", 80);
		map.put("박", 85);
		map.put("박", 95);
		
		Integer val = map.get("홍");
		
		Set<String> keys= map.keySet();
		
		for (String key : keys) {
			System.out.printf("key: %s, value: %s\n", key, map.get(key));
		}
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		
		for (Entry<String, Integer> ent: entry) {
			System.out.printf("key: %s, value: %s\n", ent.getKey(), ent.getValue());
		}
	}
}

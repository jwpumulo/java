package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExe2 {

	public static void main(String[] args) {
		
		Map<String, Person> family = new HashMap<String, Person>();
		family.put("아버지", new Person("홍길동", 45, "낚시"));
		family.put("어머니", new Person("최지수", 40, "독서"));
		family.put("아들", new Person("홍길수", 13, "게임"));
		family.put("딸", new Person("홍길순", 11, "유튜브"));
		
		Person father = family.get("아버지");
		System.out.printf("%s %d %s", father.getName(), father.getAge(), father.getHobby());
		
	}
}

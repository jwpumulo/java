package com.yedam.reference;

public class MemberExe { // 로그인 메소드

	// 싱글톤객체 생성
	// 1.필드를 static 선언.

	private static MemberExe instance = new MemberExe(); // 스태틱 필드
	// 2.생성자 은닉

	MemberExe() {
	}

	// 3. 인스턴스를 제공해주는 메소드. getInstance();
	static Member[] members = {

			new Member("user01", "1111", "지수"), //
			new Member("user02", "2222", "제니"), //
			new Member("user03", "3333", "로제") };

	public static MemberExe getInstance() {
		return instance();

	}

//	public boolean login(String id, String password) {
//
//		for (int i = 0; i < members.length; i++) {
//			if (members[i] != null 
//					&& members[i].getMemberId().equals(id)
//					&& members[i].getMemberId().equals(password)) {
//				return true; // id, password일치

	private static MemberExe instance() {
		// TODO Auto-generated method stub
		return null;
	}

	// 기본생성자. MemberExe(){}
	public String login(String id, String password) {

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null //
					&& members[i].getMemberId().equals(id)//
					&& members[i].getPassword().equals(password)) {
				return members[i].getMemberName(); // id, password 일치하면
			}

		}

		return null; // 일치하는 값이 없음
	}// end of login

}

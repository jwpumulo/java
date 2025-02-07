package com.yedam.api;

public class Member {
	String memberId;
	int memPoint;

	Member() {

	}

	Member(String id, int point) { // 생성자

		memberId = id;
		memPoint = point;

	}

	@Override
	public int hashCode() { // 자식 코드 재정의
//		return super.hashCode(); // Object의 Hashcode는 주소값.

		return memPoint;

	}

	@Override
	public boolean equals(Object obj) {

		// memberId같을 경우 논리적으로 같은 객체
		if (obj instanceof Member) {
			Member m2 = (Member) obj;
			if (this.memberId == m2.memberId //
					&& this.memPoint == m2.memPoint) {
				return true;
			}
		}
		return false;

//		Member m2 = (Member) obj;
//		if (this.memberId == m2.memberId) {
//			return true;
//
//		}
//		return false;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}

}

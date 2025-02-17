package com.yedam.api;

public class Member {

	String memberId;
	int memPoint;

	public Member() {

	}

	public Member(String memberId, int memPoint) {
		super();
		this.memberId = memberId;
		this.memPoint = memPoint;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return this.memPoint;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);

		if (obj instanceof Member) {
			Member member = (Member) obj;
			return this.memberId == member.memberId && this.memPoint == member.memPoint;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}
}

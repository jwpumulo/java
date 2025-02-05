package com.yedamheritance; //inheritance

/*
 * 친구목록 - 일반 (이름, 연락처, 혈액형)
 * 			- 학교 (학교의 정보)
 * 			- 회사 (회사의 정보)
 * 
 * 각 배열을 만들면 힘드니 상속을 만들어 활용
 *
 */
public class Friend extends Object {
	// 필드
	private String friendName;
	private String phoneNumber;
//	private String univName;
//	private String univMajor;
	private BloodType btype;

	// 생성자
	public Friend(String friendName, String phoneNumber) {
		this.friendName = friendName;
		this.phoneNumber = phoneNumber;

	}

	// 이름, 연락처 보여주기
	public String showwInfo() {
		return "이름: " + friendName + ", 연락처: " + phoneNumber;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	// showInfo (재정의) > 학교 정보 추가

	@Override
	public String showInfo() {
		return super.showInfo() + "학교: " + univName;

	}

	// getter setter
	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BloodType getBtype() {
		return btype;
	}

	public void setBtype(BloodType btype) {
		this.btype = btype;
	}

}

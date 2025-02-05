package com.yedamheritance;

/*
 * 학교정보.
 */

public class UnivFriend extends Friend {

	// 필드
//	private String friendName;
//	private String phoneNumber;
//	private String univName;
//	private String univMajor;
//	private BooldType
	private String univName;
	private String univMajor;

	// 생성자
	public UnivFriend(String friendName, String phoneNumber, String univName, String univMajor) {
		super(friendName, phoneNumber); // 부모

		this.univName = univName;
		this.univMajor = univMajor;
	}

	// getter, setter

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivMajor() {
		return univMajor;
	}

	public void setUnivMajor(String univMajor) {
		this.univMajor = univMajor;
	}

}

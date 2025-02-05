package com.yedamheritance;

import java.util.Scanner;

/*
 * 친구 목록 등록, 수정, 삭제
 * 
 * 
 */
public class FriendExe {

	// 싱글톤
	// 1.필드선언
	private static FriendExe instance;

	// 2.생성자 은닉
	private FriendExe() {

	}
	// 3.인스턴스를 반환하는 메소드

	Friend[] friends = new Friend[100];
	Scanner scn = new Scanner(System.in);

	// 시작메소드
	public void run() {
		boolean run = true;

		System.out.println("1.clsrnahrfhr 2.등록 3.수정 4.삭제 9.종료");
		System.out.println("메뉴선택 >>");

		int menu = scn.nextInt();
		switch (menu) {
		case 1: // 목록
			friendList();
			break;
		case 2: // 등록
			addFriend();
			break;

		case 3: // 수정
			editFriend();
			break;

		case 4: // 삭제
			delFriend();
			break;

		case 9: // 종료
			System.out.println("종료합니다");
			run = false;
			break;
		default:
			System.out.println("메뉴를 확인하세요");
		}

	}// end of run

	// 추가메소드
	void friendList() {

		System.out.println("친구목록");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] instanceof Friend) {
				System.out.println();

			}

		}

	} // end of friendList().

	// 친구: 이름, 연락처
	// 학교: 친구 + 학교명, 전공
	// 회사: 친구 + 회사명, 부서

	void addFriend() {
		System.out.println("1.친구 2.학교친구 3.회사친구");
		System.out.print("선택>");
		int choice = scn.nextInt();

		// 이름, 연락처
		System.out.println("이름입력>>");
		String name = scn.nextLine();

		System.out.println("연락처입력>> ");
		String phone = scn.nextLine();
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {// 학교 전공
			friend = new univFriend(name, phone, "", "");

		} else if (choice == 3) {// 회사, 부사
			System.out.println("회사입력>");
			String univ = scn.nextLine();
			System.out.println("부서입력>");
			String univ = scn.nextLine();

			friend = new comFriend(name, phone, "", "");

		} else {

		}
		// 빈공간에 저장
		for (int i = 0; i < friends.length; i++) {

			if (friends[i] == null) {
				friends[i] = friend;
				System.out.println("등록완료");
				break;
			}

		}
	}// end of addFriend().

	void editFriend() {

	}// end of editFriend().

	void delFriend() {

	}
	// end of delFriend().

	// 초기데이터

	String name = "";while(true)System.out.println("이름입력>> ");
	String name = scn.nextLine();
	// 이름의 정상값의 범위
	if(name.length()>=2&&name.length()<=10)
	{

		break;
	}else
	{
		System.out.println("이름은 2글자 이상 10글자 이하");

	}

	/*
	 * 친구목록, 등록, 수정, 삭제 수정: 이름, 연락처 입력
	 */

}}
package com.yedam.reference;

import java.util.Scanner;

public class BookExe2 {
	static Book[] bookRepository = new Book[100]; // 북클래스

	static Scanner scn = new Scanner(System.in);

	// 저장공간에 값을 초깃값을 생성

	public static void init() {
		bookRepository[0] = new Book("소년이 온다", "한강", "창비", 15000);
		bookRepository[1] = new Book("초역 부처의 말", "코이케류노스케", "포레스트북스", 17800);
		bookRepository[2] = new Book("작별하지 않는", "한", "문학동", 16800);
		bookRepository[3] = new Book("이처럼 사소한 것들", "홍한", "다산책방", 13800);

	} // end of init

	public static void printList() {
		System.out.println("도서명		저자	 가격");
		System.out.println("------------------------------");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].showBookInfo());
			}

		} // end of printlist
	}

	public static void addBook() {
		System.out.println("도서명 입력>");
		String title = scn.nextLine();

		System.out.println("저자 입력>");
		String author = scn.nextLine();

		System.out.println("출판사 입력>");
		String press = scn.nextLine();

		System.out.println("가격 입력>");
		int price = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {

			if (bookRepository[i] == null) {
				bookRepository[i] = new Book(title, author, press, price);
				System.out.println("등록완료");
				break; // for 종료
			}
		}

	}// end of addBook

	public static void searchList() {

		System.out.println("출판사 입력>");
		String press = scn.nextLine();

		System.out.println("도서명		 	 저자	  가격");
		System.out.println("------------------------------");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookPress().equals(press)) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("------------------------------");

	}

	public static void modifyBook() {

		System.out.println("도서명 입력>");
		String title = scn.nextLine();

		System.out.println("가격 입력>");
		int price = Integer.parseInt(scn.nextLine());

		// 도서명으로 검색 > 입력 받은 값으로 필드 변경.

		boolean isExist = false; //
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookTitle().equals(title)) {
				bookRepository[i].setBookPrice(price);
				System.out.println("수정완료");
				isExist = true;

				break; // 수정완료되면 반복문 종료
			}

		} // end of for
		if (!isExist) {
			System.out.println("찾는 도서가 없습니다.");
		}

	}

	public static void showDetail() {

		System.out.print("도서명 입력>");
		String title = scn.nextLine();
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookTitle().equals(title)) {
				bookRepository[i].showDetailInfo(); // 상세출력 메소드 호출할 때는 ()꼭!
				break;
			}
		}

	}

	public static void main(String[] args) { // 메인

		init();

		System.out.println("------------------------------");

		boolean run = true;

		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.수정 5.상세 0.종료");
			System.out.println("메뉴를 선택하세요.");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case 1: // 목록출력. 도서명, 저자, 가격
				printList();
				break;

			case 2: // 등록하기
				addBook();
				break;

			case 3: // 조회 (출판사)

				searchList();
				break;

			case 4: // 수정

				modifyBook();
				break;

			case 5: // 상세

				showDetail();
				break;

//				Calculater cal = new Calculator();
//				cal.getBookinfo(title, bookRepository).showDetailInfo();

			case 0:
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요.");

			} // switch

		} // while

	}// end of main

} // end of classpackage com.yedam.reference;

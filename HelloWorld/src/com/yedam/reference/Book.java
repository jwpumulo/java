package com.yedam.reference;

/*
도서명 저자 출판사 판매가격
*/

public class Book {

	public static Object showDetailInf;
	// 필드
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice; // 프라이빗

	// 접근제한자 p386
	// public 다른패키지더라도 사용가능, default, private

	// 생성자 (필드를 초기화 해주는)
	public Book(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}

	// 제목, 저자, 가격 (메소드)
	public String showBookInfo() {
		return bookTitle + "	" + bookAuthor + "	" + bookPrice;

	}

	void showDetailInfo() {

		// 도서명: 이것이 자바다 출판사: 한빛 미디어
		// 저 자: 신용권 가 격: 25000원
		String strFormat = " 도서명: %10s\t출판사: %16s\n 저 자: %13s\t\t가 격: %5d 원\n ";
		System.out.printf(strFormat, bookTitle, bookPress, bookAuthor, bookPrice);

	}

// setter 메소드를 가지고 필드를 채워줌
	void setBookPrice(int bookPrice) {
		if (bookPrice < 0) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookPrice;
	}

	void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	// getter

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public int getBookPrice() {
		return bookPrice;
	}

}// end of class

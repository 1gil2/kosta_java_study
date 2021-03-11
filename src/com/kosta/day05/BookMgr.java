package com.kosta.day05;

public class BookMgr {
	Book[] booklist;
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(Book book : booklist) {
			System.out.println(book.getTitle());
		}
	}
	
	void printTotalPrice() {
		int total = 0;
		System.out.println("=== 책 가격의 총합 ===");
		for(Book book : booklist) {
			total += book.getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + total);
	}

}

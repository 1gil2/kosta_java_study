package com.kosta.day10;

import java.util.Comparator;

public class BookDescComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		//desc ... 제목과 가격으로
		int result = o1.getTitle().compareTo(o2.getTitle());
		if(result == 0) {
			//가격으로 asc
			return o1.getPrice() - o2.getPrice();
		}
		return result;
	}
	
}

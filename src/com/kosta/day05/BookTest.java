package com.kosta.day05;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class BookTest {

	public static void main(String[] args) {

		Book[] b = new Book[5];
		b[0] = new Book("Java", 30000);
		b[1] = new Book("JSP", 25000);
		b[2] = new Book("SQL", 20000);
		b[3] = new Book("JDBC", 32000);
		b[4] = new Book("EJB", 25000);
		
		BookMgr bm = new BookMgr(b);
		bm.printBookList();
		bm.printTotalPrice();
	}

}

package com.kosta.day14;

import java.util.List;
import java.util.Vector;

public class ThreadCollection {

	public static void main(String[] args) {
		List<String> aList = new Vector<>();
		
		MyThreadA t1 = new MyThreadA("A������", aList);
		MyThreadB t2 = new MyThreadB("B������", aList);
		
		t1.start();
		t2.start();

	}

}

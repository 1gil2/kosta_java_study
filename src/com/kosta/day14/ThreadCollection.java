package com.kosta.day14;

import java.util.List;
import java.util.Vector;

public class ThreadCollection {

	public static void main(String[] args) {
		List<String> aList = new Vector<>();
		
		MyThreadA t1 = new MyThreadA("A쓰레드", aList);
		MyThreadB t2 = new MyThreadB("B쓰레드", aList);
		
		t1.start();
		t2.start();

	}

}

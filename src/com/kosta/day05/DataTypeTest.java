package com.kosta.day05;

import java.util.concurrent.atomic.AtomicBoolean;

public class DataTypeTest {

	private int tom = -1;
	private String marry = "9";
	private boolean john;
	private String sarah = "Sarah Jang";
	
	public void printMyType() {
		System.out.println("our friend..\n"
				+ tom + ", " + marry + ", " + john + " and " + sarah);
	}
	
	public static void main(String[] args) {
		new DataTypeTest().printMyType();
	}

}


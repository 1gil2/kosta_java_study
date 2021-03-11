package com.kosta.day04;

public class NotebookTest {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("1. 파라메어 없음, return 없음");
		
		Notebook n1 = new Notebook("abc12345", "그램123", 150);
		Notebook n2 = new Notebook("abc1ㄴㅁㄹ2345", "개", 150);
		Notebook n3 = new Notebook("abc12345", "그램123", 150);
	}
}
package com.kosta.day08;

public class NoteBookTest {
	
	public static void method1(Volume vv) {
		vv.volumeUp(100);
		vv.volumeDown(20);
		((Notebook)vv).test();
		System.out.println(Volume.TITLE);
		
		vv.close();
		Volume.volumeInfo(); //interface¿« static method
	}

	public static void main(String[] args) {
		Notebook aa = new Notebook();
		Volume bb = new Notebook();
		method1(aa);
		method1(bb);
	}

}

package com.kosta.day12.review;

public class MailBoxTest {

	public static void main(String[] args) {
		method1();
		
	}

	private static void method1() {
		
		MailBox box = new MailBox();
		String[] messages = {"ÇÏÀÌ", "¿­°ø", "¹ÙÀÌ", "±ôºı"};
		
		Thread readerThread = new ReaderThread(box, messages.length);
		WriterThread writer = new WriterThread(box, messages);
		Thread writerThread = new Thread(writer);
		
		readerThread.start();
		writerThread.start();
		
	}

}

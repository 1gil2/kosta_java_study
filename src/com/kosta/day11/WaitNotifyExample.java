package com.kosta.day11;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		System.out.println("djlls");
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}

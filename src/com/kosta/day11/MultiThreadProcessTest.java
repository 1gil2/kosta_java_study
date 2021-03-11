package com.kosta.day11;

public class MultiThreadProcessTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + "����");
		
		// Multi Thread ����ϱ�
		// 1. Thread��ӹ��� class�̿�...�빮�� ���
		// 2. Runnable Interface�� ������class�̿�...�ҹ��� ���
		Thread t1 = new AlphaThread();
		Runnable r = new AlphaThread2();
		Thread t2 = new Thread(r);
		Thread t3 = new AlphaThread();
		
			t1.setName("�빮�� 1");
		t2.setName("�ҹ��� 1");
		t3.setName("�빮�� 2");
		
		t1.start(); // run�� �ڵ�����
		t2.start(); 
		t3.start();
		
		
		// main�� ���ڸ� ���
		for(int i = 1; i <= 26; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + "��");
		
	}

}

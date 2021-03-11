package com.kosta.day11;

//�ٸ� class�� ��ӹް����� �ʾƼ� Thread��� �Ұ���
//run�޼��带 �����ؾ� ��Ƽthread�� ��밡��
public class AlphaThread2 extends Object implements Runnable{

	@Override
	public void run() {
		System.out.println("�ҹ��� ������ �̸� : " + Thread.currentThread().getName());
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(Thread.currentThread().getName() + " -> " + c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

package com.kosta.day12;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("�ٸ� �����尡 ���ͷ�Ʈ�� �ɾ ���� ������ ����");
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}

package com.kosta.day11;

//�ٸ� class�� ��ӹް����� �ʾƼ� Thread��� ����
//run�޼��带 �����ؾ� ��Ƽthread�� ��밡��
public class AlphaThread extends Thread{

	@Override
	public void run() {
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.println(getName() + " -> " + c);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5�� ���
		}
	}
	
}

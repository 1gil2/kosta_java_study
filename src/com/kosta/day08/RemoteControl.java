package com.kosta.day08;

public interface RemoteControl {
	
	//1. ���...public static final ��������
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//2. abstract �޼���...�����ְ� ��������.
	//public abstract ��������
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//3. default �޼���...����class ���� ���������� ����ϴ� ��� ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//4. static �޼���...
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}

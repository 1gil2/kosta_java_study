package com.kosta.day08;

//interface -> ��� + �߻�޼���
//abstract class -> �Ϲ� class + �߻�޼���
public interface Volume {

	//1. ���
	public static final String TITLE="����";
	public static final String TITLE2="����2";
	
	//2. �߻�޼���
	void volumeUp(int level);
	abstract void volumeDown(int level);
	//3. default method 8 �������� �߰���
	default void close() {
		System.out.println("Volume interface ������ ��� class�� ����ȴ�.");
	}
	
	//4. static method
	static void volumeInfo() {
		System.out.println("Volume Infomation");
	}
	
}

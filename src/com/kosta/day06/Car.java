package com.kosta.day06;

import java.time.Year;

//class : object ����� Ʋ�̴�.
//object : class�� �̿��ؼ� ���� ������ ��ü�̴�.

public class Car {
	//1. �������(field) : non-static(instance����), static(class����)
	private int speed;
	private boolean stop;
	private static int count; //object��������
	private static final String COMPANY = "�����ڵ���"; //���
	private final int year; //instance����, final�� �ѹ� setting, ����Ұ�
	
	//2. ������...new�ÿ� �ڵ�ȣ��Ǵ� �޼���
	public Car() {
		this(0, false, 2021);
	}
	
	public Car(int speed, boolean stop, int year) {
		super();
		this.speed = speed;
		this.stop = stop;
		this.year = year;
		count++;
		System.out.println(this.getClass().getSimpleName() + "����");
	}


	//3.�Ϲݸ޼���
	//getter/setter : �ܺο��� ���� �аų� ������ �� ���
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Car.count = count;
	}
	//static method : ��ü�������� ȣ�Ⱑ��
	public static String getCompany() {
		return COMPANY;
	}

	public int getYear() {
		return year;
	}
	
	public void print() {
		System.out.println("-----Car����-----");
		System.out.println(speed + "," + stop + "," + year + "," + count + "," + COMPANY);
	}
	//4. instance block, static block
	{
		System.out.println("instance������ ���� ����ȴ�.");
		System.out.println("***********************");
	}
	
	static {
		System.out.println("class�� load�ÿ� ����ȴ�.");
		System.out.println("######################");
	}
}

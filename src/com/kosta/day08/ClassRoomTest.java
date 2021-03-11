package com.kosta.day08;

public class ClassRoomTest {

	public static void main(String[] args) {
		method3();

	}

	private static void method1() {
		//1. instance inner class
		ClassRoom classRoom = new ClassRoom();
		ClassRoom.Desk desk = classRoom.new Desk();
		//ClassRoom.Desk desk = new ClassRoom().new Desk();
		System.out.println(desk.title3);
	}
	
	private static void method2() {
		//2. static inner class
		System.out.println(ClassRoom.Chair.title6);

		ClassRoom.Chair cc = new ClassRoom.Chair();
		System.out.println(cc.title5);
	}
	
	private static void method3() {
		//3. local inner class
		ClassRoom classRoom = new ClassRoom();
		classRoom.test("변수1", "변수2");
	}

}

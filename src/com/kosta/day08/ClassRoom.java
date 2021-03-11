package com.kosta.day08;

public class ClassRoom {
	
	String title1 = "instance 변수"; 	//instance 변수
	static String title2 = "static변수"; //static 변수
	
	//1. instance inner class
	class Desk{
		String title3 = "instance inner class 의 instance 변수";
		//불가 static String title4 = "instance inner class 의 static 변수";
	}
	
	//2. static inner class
	static class Chair{
		String title5 = "static inner class 의 instance 변수";
		static String title6 = "static inner class 의 static 변수";
	}
	
	//3. local inner class
	void test(String param, String param2) {
		String title8 = "local 변수";
		//param = "변수수정"; local 변수들은 final, 한번 사용하면 수정 불가
		param2 = "변수수정";
		String title9 = "local 변수";
		title9 = "변수수정";
		
		class Computer{
			String title7 = "local inner class 의 instance 변수";
			//불가 static String title8 = "local inner class 의 static 변수";
			
			void print() {
				System.out.println(param);
				System.out.println(title8);
			}
		}
		Computer cc = new Computer();
		cc.print();
		System.out.println(cc.title7);
	}
}

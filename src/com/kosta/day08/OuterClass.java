package com.kosta.day08;

public class OuterClass {
	//1. field
	int java = 100;
	static int sql = 90;
	
	//2. constructor
	//3. method
	void test(String param) {
		
		String localVar = "메서드내의 지역변수...내부 class에서 사용시 수정불가";
		String localVar2 = "매서드내의 지역변수2";
		localVar2 = "aabb";
		
//		localVar = "aaa";
//		param = "bbb";
		//5. inner class...local inner class : method 안에있다.
		// -----method 내에서만 사용가능
		class LocalClass{
			int price = 1000;
			//불가 static int price2 = 2000;
			
			void printPrice() {
				System.out.println("Local instance메서드 : " + price);
				System.out.println(param);
				System.out.println(localVar);
			}
		}
		LocalClass local = new LocalClass();
		System.out.println(local.price);
		local.printPrice();
	}
	//4. static block
	
	//5. inner class...instance inner class
	class InnerClass{
		int a=10;
		
		public InnerClass() {
			System.out.println("InnerClass 생성자");
		}
		
		//static int b=20; 불가
		void test() {
			System.out.println("InnerClass instance method");
			System.out.println("outer의 instance변수 java점수 = " + java);
			System.out.println("outer의 static변수 sql점수 = " + sql);
		}
	
		//불가
//		static void test2() {
//			System.out.println("InnerClass static method");
//		}
	
	}
	//5. inner class...static inner class
	static class StaticInnerClass{
		int score=100;
		
		static String grade ="A학점";
		
		public StaticInnerClass() {
			System.out.println("StaticInnerClass생성자");
		}
		
		void printScore() {
			System.out.println("instance method : " + score);
			//불가능 System.out.println("outer의 instance변수 java점수 = " + java);
			System.out.println("outer의 static변수 sql점수 = " + sql);
		}
		
		static void printGrade() {
			System.out.println("static method : " + grade);
			//불가능 System.out.println("outer의 instance변수 java점수 = " + java);
			System.out.println("outer의 static변수 sql점수 = " + sql);
		}
	}
}

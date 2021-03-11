package com.kosta.day08;

public class OuterClass {
	//1. field
	int java = 100;
	static int sql = 90;
	
	//2. constructor
	//3. method
	void test(String param) {
		
		String localVar = "�޼��峻�� ��������...���� class���� ���� �����Ұ�";
		String localVar2 = "�ż��峻�� ��������2";
		localVar2 = "aabb";
		
//		localVar = "aaa";
//		param = "bbb";
		//5. inner class...local inner class : method �ȿ��ִ�.
		// -----method �������� ��밡��
		class LocalClass{
			int price = 1000;
			//�Ұ� static int price2 = 2000;
			
			void printPrice() {
				System.out.println("Local instance�޼��� : " + price);
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
			System.out.println("InnerClass ������");
		}
		
		//static int b=20; �Ұ�
		void test() {
			System.out.println("InnerClass instance method");
			System.out.println("outer�� instance���� java���� = " + java);
			System.out.println("outer�� static���� sql���� = " + sql);
		}
	
		//�Ұ�
//		static void test2() {
//			System.out.println("InnerClass static method");
//		}
	
	}
	//5. inner class...static inner class
	static class StaticInnerClass{
		int score=100;
		
		static String grade ="A����";
		
		public StaticInnerClass() {
			System.out.println("StaticInnerClass������");
		}
		
		void printScore() {
			System.out.println("instance method : " + score);
			//�Ұ��� System.out.println("outer�� instance���� java���� = " + java);
			System.out.println("outer�� static���� sql���� = " + sql);
		}
		
		static void printGrade() {
			System.out.println("static method : " + grade);
			//�Ұ��� System.out.println("outer�� instance���� java���� = " + java);
			System.out.println("outer�� static���� sql���� = " + sql);
		}
	}
}

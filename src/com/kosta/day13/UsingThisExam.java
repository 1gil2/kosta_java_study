package com.kosta.day13;

interface MyFunctionalInterface{
	public void method();
}

class UsingThis{
	public int outterField = 10;

	class Inner{
		int innerField = 20;

		void method() {    //�Ķ��Ÿ�� local ����
			String grade = "A����";  //local ����
			
//			score = 88;
			
			MyFunctionalInterface fi = () -> {

				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField);

				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField);
			};
			fi.method();

		}
	}
}

public class UsingThisExam {
	public static void main(String[] args) {
		UsingThis.Inner inner2 = new UsingThis().new Inner();
		UsingThis us = new UsingThis();
		UsingThis.Inner inner = us.new Inner();
		
		inner.method();
		inner2.method();
	}
}

package com.kosta.day11;

public class OveridingTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);

		System.out.println(ms1);
		System.out.println(ms2);
		
		String s1 = new String("30");

		if(ms1.equals(ms2))
			System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
		else {
			System.out.println("ms1�� ms2�� �հ�� �������� �ʽ��ϴ�.");
		}
		
		if(ms1.equals(s1))
			System.out.println("ms1�� s1�� �հ�� �����մϴ�.");
		else
			System.out.println("ms1�� s1�� �հ�� �������� �ʽ��ϴ�.");
		
	}

}

class MySum {
	int first;
	int second;

	MySum (int first, int second){
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		//return first + second + "";
		return String.valueOf(first + second);
	}

	@Override
	public boolean equals(Object obj) {
		
//		if(obj instanceof MySum) {
//			return this.toString().equals((MySum)obj.toString());
//		}
//		return false;
		
		if(obj == null || !(obj instanceof MySum)) return false;
		MySum my = (MySum) obj;
		
		return this.toString().equals(my.toString());
		//return first + second == my.first + my.second;
	}
	
}
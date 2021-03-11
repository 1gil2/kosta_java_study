package com.kosta.day03;

public class calc {
	
	static int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	static int sum2(int ... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int ans1 = sum1(new int[] {1,2,3});
		int ans2 = sum2(1,2,3,4);
		
		System.out.println(ans1 + "," + ans2);
	}
}

package com.kosta.day03;


public class LAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySort(new int[] {3,24,1,55,17,43,5});

	}
	
	private static void mySort(int[] arr) {
		int len = arr.length;
		int temp;
		for(int i=0; i<len-1; i++) {
			for(int j=i+1;j<len; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	
	private static int myAbs(int a, int b) {
		int c = a - b;
		if (c > 0)
			return c;
		else
			return -c;
	}
	
	
	private static void printSeason(int month) {
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			return;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			return;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			return;
		case 12:
		case 2:
		case 1:
			System.out.println("겨울");
			return;
		default:
			System.out.println("1~12만");
			return;
		
		}
	}

}

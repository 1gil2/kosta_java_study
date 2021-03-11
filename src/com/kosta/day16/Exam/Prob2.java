package com.kosta.day16.Exam;

import java.util.Arrays;

public class Prob2 {

	public static void main(String[] args){
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));

	}

	private static String leftPad(String str, int size, char fillChar) {
		
		try {
			if(str.length() > size) throw new IllegalSizeException("���ڿ��� ���̺��� size�� Ů�ϴ�.");
		} catch (IllegalSizeException e) {
			System.out.println(e.getMessage());
			return "";
		}
		
		int diff = size - str.length();
		String message = "";
		for(int i = 0; i < diff; i++) {
			message += fillChar;
		}
		
//		return message+str;
		String[] arr = new String[diff];
		Arrays.fill(arr, fillChar+"");
		return Arrays.toString(arr).replaceAll("\\[|,| |\\]", "") + str;
	}

	public static String leftPad2(String str, int size, char fillChar) throws IllegalSizeException{
		//�����Ͻÿ�.....return�� �����Ұ� 
		int ls = str.length();
		String temp = "";

		try {
			if(ls > size) {
				throw new IllegalSizeException("���ڿ��� ���̺��� size�� Ů�ϴ�.");
			}
			else {
				if(ls == size) {
					return str;
				}
				else if(ls < size) {
					for(int i = 0; i < size - ls; i++) {
						temp += fillChar;
					}
					return temp + str;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "";
		//		if(ls == size) {
		//			return str;
		//		}
		//		else if(ls < size) {
		//			for(int i = 0; i < size - ls; i++) {
		//				temp += fillChar;
		//			}
		//			return temp + str;
		//		}
		//		else {
		//			throw new IllegalSizeException("���ڿ��� ���̺��� size�� Ů�ϴ�.");
		//		}
	}

}

//�����Ͻÿ�.
class IllegalSizeException extends RuntimeException{
	
	public IllegalSizeException(String message) {
		super(message);
	}

}




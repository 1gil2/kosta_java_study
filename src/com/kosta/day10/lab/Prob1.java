package com.kosta.day10.lab;

public class Prob1 {

	public static void main(String[] args) {
		String s = "everyday we have is one more than we deserve";
		System.out.println("암호화할 문자열 : " + s);
		
		System.out.print("암호화된 문자열 : ");
		int ls = s.length();
		for(int i=0; i<ls; i++) {
			char c = s.charAt(i);
			if((int)c == 32)
				System.out.print(c);
			else {
				int a = (int)c;
				if(a+3 > 'z')
					a -= 23;
				else
					a += 3;
				System.out.print((char)a);
			}
		}
	}
}

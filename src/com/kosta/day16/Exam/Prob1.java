package com.kosta.day16.Exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"Ȳ����100��","����ȣ89��","���μ�88��","��������177��"};
		printMaxScore2(array);
	}	

	// ���� ǥ����
	private static void printMaxScore2(String[] array) {
		String expr = "^([��-�R]{3,4})([0-9]{2,3})[��-�R]";
		int maxScore = 0;
		String maxName = "";
		Pattern p = Pattern.compile(expr);

		for(String s : array) {
			Matcher m = p.matcher(s);
			if(!m.find()) continue;
			String name = m.group(1);
			int score = Integer.parseInt(m.group(2));

			if(maxScore < score) {
				maxScore = score;
				maxName = name;
			}			
		}
		System.out.println("�ְ������� " + maxName +"�� " + maxScore + "�� �Դϴ�."); 
	}
	// �� Ǯ��
	private static void printMaxScore(String[] array){
		String temp = "";
		int max = 0;

		for(String s : array) {
			String name = "";
			String num = "";
			int ls = s.length();
			for(int i=0; i<ls-1; i++) {
				char c = s.charAt(i);
				if(c >= 48 && c < 58) { // Character.isDigit(c)
					num += c;
				}
				else {
					name += c;
				}
			}
			if(Integer.parseInt(num) > max) {
				max = Integer.parseInt(num);
				temp = name;
			}
		}
		System.out.println("�ְ������� " + temp +"�� " + max + "�� �Դϴ�."); 
	}	
}

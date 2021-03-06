package com.kosta.day16.Exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기100점","조성호89점","한인성88점","독고정진177점"};
		printMaxScore2(array);
	}	

	// 정규 표현식
	private static void printMaxScore2(String[] array) {
		String expr = "^([가-힣]{3,4})([0-9]{2,3})[가-힣]";
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
		System.out.println("최고점수는 " + maxName +"님 " + maxScore + "점 입니다."); 
	}
	// 내 풀이
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
		System.out.println("최고점수는 " + temp +"님 " + max + "점 입니다."); 
	}	
}

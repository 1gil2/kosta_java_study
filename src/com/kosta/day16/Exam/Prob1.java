package com.kosta.day16.Exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"È²³²±â100Á¡","Á¶¼ºÈ£89Á¡","ÇÑÀÎ¼º88Á¡","µ¶°íÁ¤Áø177Á¡"};
		printMaxScore2(array);
	}	

	// Á¤±Ô Ç¥Çö½Ä
	private static void printMaxScore2(String[] array) {
		String expr = "^([°¡-ÆR]{3,4})([0-9]{2,3})[°¡-ÆR]";
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
		System.out.println("ÃÖ°íÁ¡¼ö´Â " + maxName +"´Ô " + maxScore + "Á¡ ÀÔ´Ï´Ù."); 
	}
	// ³» Ç®ÀÌ
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
		System.out.println("ÃÖ°íÁ¡¼ö´Â " + temp +"´Ô " + max + "Á¡ ÀÔ´Ï´Ù."); 
	}	
}

package com.kosta.day13;

import java.util.function.ToIntFunction;

public class LambdaExample {
	
	private static Student[] students = {
		new Student("ȫ?浿", 90, 96),
		new Student("?ſ???", 95, 93)
	};
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("???? ???? ???? : " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("???? ???? ???? : " + mathAvg);

	}
	
	private static double avg(ToIntFunction<Student> f) {
		double avg = 0;
		for(Student student: students) {
			avg += f.applyAsInt(student);
		}
		avg /= students.length;
		return avg;
	}

	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", englishScore=" + englishScore + ", mathScore=" + mathScore + "]";
		}	
		
		
	}

}

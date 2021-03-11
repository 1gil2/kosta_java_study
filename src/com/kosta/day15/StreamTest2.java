package com.kosta.day15;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	
	static Student[] arr = {
			new Student("È«±æµ¿", 100),
			new Student("½Å¿ë±Ç", 82),
			new Student("±èÀÚ¹Ù", 90)
			};
	static List<Student> alist = Arrays.asList(arr);

	public static void main(String[] args) {
		method1();
			
	}

	private static void method1() {
		Stream<Student> stream = alist.stream();
		
		Function<Student, Integer> f1 = aa -> aa.getScore();
		ToIntFunction<Student> f2 = aa -> aa.getScore();
		
		IntStream is = stream.mapToInt(f2);
		OptionalDouble od = is.average();
		double avg = od.getAsDouble();
		
	 	double avg2 = stream.mapToInt(aa -> aa.getScore()).average().getAsDouble();
	 	
	 	double avg3 = stream.mapToInt(Student::getScore).average().getAsDouble();
	
	}

}

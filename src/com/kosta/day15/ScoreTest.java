package com.kosta.day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ScoreTest {

	public void printScore(String fileName) throws IOException {
		FileReader fr = null; 
		BufferedReader br = null;
		
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		String line = br.readLine();
		System.out.println(line.replace('/', '\t') + '\t' + "รัมก");
		
		while((line = br.readLine()) != null) {
			System.out.print(line.replace('/', '\t'));
			String[] arr = line.split("/");
			
			int sum = 0;
			
			Stream<String> stream = Arrays.stream(arr, 1, arr.length);
			ToIntFunction<String> f2 = aa -> Integer.parseInt(aa);
			IntStream is = stream.mapToInt(f2);
			sum = is.sum();
			
//			for(int i = 1; i< 4; i++) {
//				sum += Integer.parseInt(arr[i]);
//			}
			
			System.out.println("\t" + sum);
			
		}
		
		br.close();
		fr.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		String fname = "src/com/kosta/day15/data.txt";
		new ScoreTest().printScore(fname);
		
	}

}

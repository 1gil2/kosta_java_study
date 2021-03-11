package com.kosta.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Review {

	public static void main(String[] args) {
		fileCopy();

	}

	private static void fileCopy() {
		// \t : tab, \n : new line, \\ : \
		// 폴더이름구분시 /, \\ 모두 가능
		String originalFile = "src/com/kosta/day15/Student.java";
		String targetFileString = "NewStudent.text";
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String line = null;
		try {
			fr = new FileReader(originalFile);
			br = new BufferedReader(fr);
			fw = new FileWriter(targetFileString);
			bw = new BufferedWriter(fw);
			
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

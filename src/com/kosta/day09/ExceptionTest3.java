package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//예외발생
//1. 자동...실행시 자동, 컴파일시 반드시
//2. 강제발생...throw 예외이름
//예외처리
//1. 내가 한다. : try - catch - finally
//2. (나를 호출한 곳으로) 떠넘긴다. : throws

public class ExceptionTest3 {

	public static void main(String[] args){
		try {
			method3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}

	private static void method3() throws IOException {
		FileReader fr = null;

		fr = new FileReader("src/com/kosta/day09/ExceptionTest3.java");
		int i;
		while((i = fr.read()) != -1) {
			System.out.print(i);
		}
		fr.close();
		
		System.out.println("try~catch 끝");
		
	}

	private static void method2() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/kosta/day09/ExceptionTest3.java");
			int i;
			while((i = fr.read()) != -1) {
				System.out.print(i);
			}		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());			
		}finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("try~catch 끝");
	}

	private static void method1() {

		FileReader fr = null;

		try {
			fr = new FileReader("src/com/kosta/day09/review/Button.java");
			System.out.println("파일열기성공");

			int i;
			try {
				while((i = fr.read()) != -1) {
					System.out.println((char)i);
				}
			} catch (IOException e) {
				System.out.println("읽기오류");
			}

		}catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는다.");
		}finally {
			try {
				if(fr!=null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

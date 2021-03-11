package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//���ܹ߻�
//1. �ڵ�...����� �ڵ�, �����Ͻ� �ݵ��
//2. �����߻�...throw �����̸�
//����ó��
//1. ���� �Ѵ�. : try - catch - finally
//2. (���� ȣ���� ������) ���ѱ��. : throws

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
		
		System.out.println("try~catch ��");
		
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
		System.out.println("try~catch ��");
	}

	private static void method1() {

		FileReader fr = null;

		try {
			fr = new FileReader("src/com/kosta/day09/review/Button.java");
			System.out.println("���Ͽ��⼺��");

			int i;
			try {
				while((i = fr.read()) != -1) {
					System.out.println((char)i);
				}
			} catch (IOException e) {
				System.out.println("�б����");
			}

		}catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʴ´�.");
		}finally {
			try {
				if(fr!=null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

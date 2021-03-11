package com.kosta.day15;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		method2();
		
	}

	private static void method2() {
		
		
	}

	private static void method1() {
		// 자바기본형 파일저장
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream("basictype.txt");
			dos = new DataOutputStream(fos);
			try {
				dos.writeInt(100);
				dos.writeBoolean(10>20);
				dos.writeDouble(3.141592);
				
				dos.close();
				fos.close();
				
				fis = new FileInputStream("basictype.txt");
				dis = new DataInputStream(fis);
				
				System.out.println(dis.readInt() + 200);
				System.out.println(dis.readBoolean());
				System.out.println(dis.readDouble() * 3);

				dis.close();
				fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

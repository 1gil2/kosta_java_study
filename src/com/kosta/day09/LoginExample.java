package com.kosta.day09;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�Է�>>");
		String id = sc.next();
		System.out.print("PASS�Է�>>");
		String pass = sc.next();
		
		try {
			login(id, pass);
		} catch (NotExistsIDException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
		
		sc.close();
		System.out.println("�α��� ����~~~");
	}

	public static void login(String id, String pass) throws NotExistsIDException, WrongPasswordException {
		if(!id.equals("blue")) {
			throw new NotExistsIDException("������������ID");
		}
		if(!pass.equals("12345")) {
			throw new WrongPasswordException("pass����");
		}
		System.out.println("ID pass ����");
	}
}

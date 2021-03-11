package com.kosta.day09;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력>>");
		String id = sc.next();
		System.out.print("PASS입력>>");
		String pass = sc.next();
		
		try {
			login(id, pass);
		} catch (NotExistsIDException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
		
		sc.close();
		System.out.println("로그인 성공~~~");
	}

	public static void login(String id, String pass) throws NotExistsIDException, WrongPasswordException {
		if(!id.equals("blue")) {
			throw new NotExistsIDException("존재하지않은ID");
		}
		if(!pass.equals("12345")) {
			throw new WrongPasswordException("pass오류");
		}
		System.out.println("ID pass 정상");
	}
}

package com.kosta.day06;

public class MemberServiceTest {

	public static void main(String[] args) {

		MemberService service = new MemberService();
		boolean result = service.login("hong", "12345");
		
		if(result) {
			System.out.println("�α��� ����");
			System.out.println("��������...");
			service.logout("hong");
		}else {
			System.out.println("�α��� ����");
		}
	}

}

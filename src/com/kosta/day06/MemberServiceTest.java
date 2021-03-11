package com.kosta.day06;

public class MemberServiceTest {

	public static void main(String[] args) {

		MemberService service = new MemberService();
		boolean result = service.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 성공");
			System.out.println("로직수행...");
			service.logout("hong");
		}else {
			System.out.println("로그인 실패");
		}
	}

}

package com.kosta.day06;


//싱글톤 .....한번만 생성하겠다.
//JSP/Servlet : 서버에 실행되는 자바프로그램
//Servlet - 싱글톤으로 사용된다.
public class ShopService {
	static ShopService shopService;
	
	public static ShopService getInstance() {
//		if(shopService == null)
//			shopService = new ShopService();
		return shopService;
	}

}

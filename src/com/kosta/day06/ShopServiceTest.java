package com.kosta.day06;

public class ShopServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService service1 =ShopService.getInstance();
		ShopService service2 =ShopService.getInstance();
		
		if(service1 == service2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
	}

}

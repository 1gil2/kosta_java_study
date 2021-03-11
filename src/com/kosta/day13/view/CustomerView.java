package com.kosta.day13.view;

import java.util.*;

import com.kosta.day13.model.CustomerDTO;

//고객정보 보여주기
//나중에는 Web저놘...HTML, CSS 이용
public class CustomerView {

	public static void display(List<CustomerDTO> custList) {
		System.out.println("*****고객정보 여러건*****");
		for(CustomerDTO cust:custList) {
			System.out.println(cust);
		}
		System.out.println();
	}
	
	public static void display(CustomerDTO cust) {
		System.out.println("*****고객정보 1건*****");
		System.out.println(cust);
		System.out.println();
	}
	
	public static void display(String message) {
		System.out.println(message);
		System.out.println();
	}
}

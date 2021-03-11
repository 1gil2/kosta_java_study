package com.kosta.day13.view;

import java.util.*;

import com.kosta.day13.model.CustomerDTO;

//������ �����ֱ�
//���߿��� Web����...HTML, CSS �̿�
public class CustomerView {

	public static void display(List<CustomerDTO> custList) {
		System.out.println("*****������ ������*****");
		for(CustomerDTO cust:custList) {
			System.out.println(cust);
		}
		System.out.println();
	}
	
	public static void display(CustomerDTO cust) {
		System.out.println("*****������ 1��*****");
		System.out.println(cust);
		System.out.println();
	}
	
	public static void display(String message) {
		System.out.println(message);
		System.out.println();
	}
}

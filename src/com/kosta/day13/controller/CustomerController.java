package com.kosta.day13.controller;

import java.util.List;
import java.util.Scanner;

import com.kosta.day13.model.CustomerDTO;
import com.kosta.day13.model.CustomerService;
import com.kosta.day13.view.CustomerView;

//서버프로그램으로 작성될 예정(servlet, controller)
public class CustomerController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<CustomerDTO> custlist = null;
		CustomerDTO cust = null;
		int result = 0;
		CustomerService service = new CustomerService();
		
		while(true) {
			System.out.println("1. 모두조회, 2. 특정고객조회");
			System.out.println("3. 전화번호로 조회, 4. 입력");
			System.out.println("5. 수정, 6. 삭제, 0. 종료");
			
			System.out.print("작업을 선택하세요>>");
			int select = sc.nextInt();
			if(select == 0) break;
			System.out.println();
			switch (select) {
			case 1:
				custlist = service.selectAll();
				CustomerView.display(custlist);
				break;
				
			case 2:
				System.out.print("조회할 ID를 입력>>");
				int custId = sc.nextInt();
				cust = service.selectById(custId);
				CustomerView.display(cust);
				break;
				
			case 3:
				System.out.print("조회할 phone 입력>>");
				String p = sc.next();
				cust = service.selectByPhone(p);
				CustomerView.display(cust);
				break;
				
			case 4:
				System.out.print("신규입력(1 AA 1234 seoul)>>");
				cust = new CustomerDTO(sc.nextInt(), sc.next(), sc.next(), sc.next());
				result = service.insert(cust);
				CustomerView.display(result==1?"입력성공":"입력실패");
				break;
				
			case 5:
				System.out.print("수정정보(1 AA 1234 seoul)>>");
				cust = new CustomerDTO(sc.nextInt(), sc.next(), sc.next(), sc.next());
				result = service.update(cust);
				CustomerView.display(result==1?"수정성공":"수정실패");
				break;
				
			case 6:
				System.out.println("삭제할 Id>>");
				result = service.delete(sc.nextInt());
				CustomerView.display(result==1?"삭제성공":"삭제실패");
				break;
			}
		}

		System.out.println("-------작업끝--------");
		sc.close();
	}

}

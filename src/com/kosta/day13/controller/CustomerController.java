package com.kosta.day13.controller;

import java.util.List;
import java.util.Scanner;

import com.kosta.day13.model.CustomerDTO;
import com.kosta.day13.model.CustomerService;
import com.kosta.day13.view.CustomerView;

//�������α׷����� �ۼ��� ����(servlet, controller)
public class CustomerController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<CustomerDTO> custlist = null;
		CustomerDTO cust = null;
		int result = 0;
		CustomerService service = new CustomerService();
		
		while(true) {
			System.out.println("1. �����ȸ, 2. Ư������ȸ");
			System.out.println("3. ��ȭ��ȣ�� ��ȸ, 4. �Է�");
			System.out.println("5. ����, 6. ����, 0. ����");
			
			System.out.print("�۾��� �����ϼ���>>");
			int select = sc.nextInt();
			if(select == 0) break;
			System.out.println();
			switch (select) {
			case 1:
				custlist = service.selectAll();
				CustomerView.display(custlist);
				break;
				
			case 2:
				System.out.print("��ȸ�� ID�� �Է�>>");
				int custId = sc.nextInt();
				cust = service.selectById(custId);
				CustomerView.display(cust);
				break;
				
			case 3:
				System.out.print("��ȸ�� phone �Է�>>");
				String p = sc.next();
				cust = service.selectByPhone(p);
				CustomerView.display(cust);
				break;
				
			case 4:
				System.out.print("�ű��Է�(1 AA 1234 seoul)>>");
				cust = new CustomerDTO(sc.nextInt(), sc.next(), sc.next(), sc.next());
				result = service.insert(cust);
				CustomerView.display(result==1?"�Է¼���":"�Է½���");
				break;
				
			case 5:
				System.out.print("��������(1 AA 1234 seoul)>>");
				cust = new CustomerDTO(sc.nextInt(), sc.next(), sc.next(), sc.next());
				result = service.update(cust);
				CustomerView.display(result==1?"��������":"��������");
				break;
				
			case 6:
				System.out.println("������ Id>>");
				result = service.delete(sc.nextInt());
				CustomerView.display(result==1?"��������":"��������");
				break;
			}
		}

		System.out.println("-------�۾���--------");
		sc.close();
	}

}

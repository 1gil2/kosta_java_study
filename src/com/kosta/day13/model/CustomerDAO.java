package com.kosta.day13.model;

import java.util.ArrayList;
import java.util.List;

//����ڿ�û -> Controller -> Service(��������) -> DAO(Data Access Object) -> DB
//    ���� <-            <-                <-                         <-
//DAO(Data Access Object) : ���������߿� DB�� �����ϴ� ������ �ۼ��Ѵ�.
public class CustomerDAO {

	List<CustomerDTO> custlist = new ArrayList<CustomerDTO>();
	public CustomerDAO() {
		custlist.add(new CustomerDTO(1, "�ѱ�", "010-1111-2222", "������"));
		custlist.add(new CustomerDTO(2, "�ѽ�", "010-3333-4444", "������"));
		custlist.add(new CustomerDTO(3, "�뼺", "010-5555-6666", "������"));
		custlist.add(new CustomerDTO(4, "����", "010-7777-8888", "���Ǳ�"));
	}
	
	
	public List<CustomerDTO> selectAll() {
		//��� ���� ��ȸ�Ѵ�.
		
		return custlist;
	}

	public CustomerDTO selectById(int custId){
		//���̵�� ���� ��ȸ�Ѵ�.
		for(CustomerDTO cust : custlist) {
			if(cust.getCustId() == custId)
				return cust;
		}
		return null;
	}

	public CustomerDTO selectByPhone(String phone) {
		//��ȭ��ȣ�� ���� ��ȸ�Ѵ�.
		for(CustomerDTO cust : custlist) {
			if(cust.getPhone().equals(phone))
				return cust;
		}
		return null;
	}

	public int insert(CustomerDTO cust) {
		//�������� �Է��Ѵ�.
		custlist.add(cust);
		return 1;
	}

	public int update(CustomerDTO cust) {
		//�������� �����Ѵ�.
		for(int i = 0; i< custlist.size(); i++) {
			CustomerDTO cc = custlist.get(i);
			if(cc.getCustId() == cust.getCustId()) {
				cc.setAddress(cust.getAddress());
				cc.setCustName(cust.getCustName());
				cc.setPhone(cust.getPhone());
			}
		}
		return 1;
	}

	public int delete(int custId) {
		//�������� �����.
		for(int i = 0; i< custlist.size(); i++) {
			if(custlist.get(i).getCustId() == custId) {
				custlist.remove(i);
				return 1;
			}
		}
		return 0;
	}

}


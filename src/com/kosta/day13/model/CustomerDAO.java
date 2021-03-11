package com.kosta.day13.model;

import java.util.ArrayList;
import java.util.List;

//사용자요청 -> Controller -> Service(업무로직) -> DAO(Data Access Object) -> DB
//    응답 <-            <-                <-                         <-
//DAO(Data Access Object) : 업무로직중에 DB에 가야하는 업무를 작성한다.
public class CustomerDAO {

	List<CustomerDTO> custlist = new ArrayList<CustomerDTO>();
	public CustomerDAO() {
		custlist.add(new CustomerDTO(1, "한길", "010-1111-2222", "마포구"));
		custlist.add(new CustomerDTO(2, "한슬", "010-3333-4444", "연제구"));
		custlist.add(new CustomerDTO(3, "대성", "010-5555-6666", "마포구"));
		custlist.add(new CustomerDTO(4, "나용", "010-7777-8888", "관악구"));
	}
	
	
	public List<CustomerDTO> selectAll() {
		//모든 고객을 조회한다.
		
		return custlist;
	}

	public CustomerDTO selectById(int custId){
		//아이디로 고객을 조회한다.
		for(CustomerDTO cust : custlist) {
			if(cust.getCustId() == custId)
				return cust;
		}
		return null;
	}

	public CustomerDTO selectByPhone(String phone) {
		//전화번호로 고객을 조회한다.
		for(CustomerDTO cust : custlist) {
			if(cust.getPhone().equals(phone))
				return cust;
		}
		return null;
	}

	public int insert(CustomerDTO cust) {
		//고객정보를 입력한다.
		custlist.add(cust);
		return 1;
	}

	public int update(CustomerDTO cust) {
		//고객정보를 갱신한다.
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
		//고객정보를 지운다.
		for(int i = 0; i< custlist.size(); i++) {
			if(custlist.get(i).getCustId() == custId) {
				custlist.remove(i);
				return 1;
			}
		}
		return 0;
	}

}


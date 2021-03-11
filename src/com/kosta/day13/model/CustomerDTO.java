package com.kosta.day13.model;


//DTO(Data Transfer Object) 데이터 전송을 위한 틀
public class CustomerDTO implements Comparable<CustomerDTO> {
	
	private int custId;
	private String custName;
	private String phone;
	private String address;
	
	public CustomerDTO() {
		super();
	}
	
	public CustomerDTO(int custId, String custName, String phone, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phone = phone;
		this.address = address;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "CustomerDTO [custId=" + custId + ", custName=" + custName + ", phone=" + phone + ", address=" + address
				+ "]";
	}

	//중복체크를 위해 추가됨(2021-03-05)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		if (custId != other.custId)
			return false;
		return true;
	}

	@Override
	public int compareTo(CustomerDTO o) {
		int aa = address.compareTo(o.address);
		if(aa == 0)
			return custId - o.custId;
		return aa;
	}

	
}









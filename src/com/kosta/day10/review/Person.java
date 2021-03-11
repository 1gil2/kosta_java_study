package com.kosta.day10.review;

import java.util.Arrays;

public class Person implements Cloneable{
	private String name;
	private int age;
	private Car car;
	private String[] phone;
	
	public Person(String name, int age, Car car, String[] phone) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + ", phone=" + Arrays.toString(phone) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Person)) return false;
		Person otherPerson = (Person)obj;
		return this.name.equals(otherPerson.name) &&
				this.age == otherPerson.age &&
				this.car.equals(otherPerson.car) &&
				Arrays.equals(this.phone, otherPerson.phone);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//구현추가안해도 얕은복제가능
		//깊은 복제
		Person person = (Person)super.clone(); //얕은복제
		person.car = new Car(this.car.getModel(), this.car.getPrice());
		person.phone = Arrays.copyOf(this.phone, this.phone.length);
		
		return person;
	}
	
}

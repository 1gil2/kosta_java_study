package com.kosta.day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		method3();
	}

	private static void method6(String classname) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls2 = Class.forName(classname);
		System.out.println(cls2.getSimpleName());
		
		//객체얻기
		Object obj = cls2.newInstance();
		if(obj instanceof Book) {
			String s =  ((Book)obj).getTitle();
			System.out.println(s);
		}
		if(obj instanceof Car) {
			((Car)obj).setModel("모델");
			System.out.println(((Car)obj).getModel());
		}
		
	}

	private static void method5(String classname) throws ClassNotFoundException {
		Class cls2 = Class.forName(classname);
		System.out.println(cls2.getSimpleName());
		System.out.println("+++++++++++++++++++++++++");
		
	 	Method[] methods = cls2.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("메소드 이름" + method.getName());
			System.out.println("매개변수 갯수" + method.getParameterCount());
			Class[] paras = method.getParameterTypes();
			for(Class para: paras) {
				System.out.println("매개변수 : " + para.getName());
			}
			System.out.println();
		}
	}

	private static void method4(String classname) throws ClassNotFoundException {
		Class cls2 = Class.forName(classname);
		System.out.println(cls2.getSimpleName());
		
		System.out.println("+++++++++++++++++++++++++");
		Field[] fields = cls2.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
			System.out.println(field.getType());
		}
		System.out.println();
	}

	private static void method3() throws ClassNotFoundException,  InstantiationException, IllegalAccessException{
		method6("com.kosta.day10.Book");
		method6("com.kosta.day10.Car");
	}

	private static void method2(String classname) throws ClassNotFoundException {
		Class cls2 = Class.forName(classname);
		System.out.println(cls2.getSimpleName());
		System.out.println("------------------");
		
	 	Constructor[] constructors = cls2.getDeclaredConstructors();
	 	for(Constructor constructor : constructors) {
	 		System.out.println("생성자이름 : " + constructor.getName());
	 		System.out.println("파라메터갯수 : " + constructor.getParameterCount());
	 		Class[] aa = constructor.getParameterTypes();
	 		for(Class c: aa) {
	 			System.out.println(c.getName());
	 		}
	 	}
	}

	private static void method1() {
		Book book = new Book("자바", 10000, false);
		Class cls1 = book.getClass();
		
		System.out.println(cls1.getName());
		System.out.println(cls1.getSimpleName());
		System.out.println(cls1.toString());
		System.out.println(cls1.getPackageName());
		System.out.println(cls1.getModifiers());
		
		try {
			Class cls2 = Class.forName("com.kosta.day10.Book");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}

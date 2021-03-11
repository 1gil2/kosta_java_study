package com.kosta.day10;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemTest {

	public static void main(String[] args) {
		method4();
	
	}

	private static void method4() {
		Map<String, String> envs = System.getenv();
		Set<String> keySet = envs.keySet();
		
		for(String s : keySet){
			System.out.println(s + " --> " + System.getenv(s));
		}
	}

	private static void method3() {
		String s = System.getenv("JAVA_HOME");
		System.out.println(s);
		
		s = System.getenv("path");
		System.out.println(s);
		
	}

	private static void method2() {
		//Properties���� Ű�� ���� ������ ����ִ�. Map
		Properties ps = System.getProperties();
		Set<Object> keys = ps.keySet();
		
		for(Object object : keys) {
			System.out.println(object + " ==> " + System.getProperty((String)object));
		}
		
	}

	private static void method1() {
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("os.name"));		
	
	}

}

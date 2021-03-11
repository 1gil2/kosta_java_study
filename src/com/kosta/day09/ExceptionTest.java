package com.kosta.day09;

public class ExceptionTest {

	public static void main(String[] args) {
		method8();
		System.out.println("main end");
	}

	private static void method8() {
		try {
			int a = 10/1;
			int[] arr = new int[5];
			arr[4] = 100;
			String s = "JAVA";
			System.out.println(s.length());
			Object obj = new String("�ڹ�");
			String st = (String)obj;
			Integer i = (Integer)obj;
		//Exception���� �ѹ濡 ó���ص� ������ ������ �������� �ٸ� ó���� �ϱ����� ������.
		}catch (ArithmeticException e) {
			System.out.println("0���� ������ ����");
		}catch (IndexOutOfBoundsException e){
			System.out.println("index���� ���");
		}catch (NullPointerException e) {
			System.out.println("Null�����Ұ�");
		}catch (ClassCastException e) {
			System.out.println("����ȯ ����");
		}catch (Exception e) {
			System.out.println("��Ÿ ����" + e.getMessage());
		}finally {
			System.out.println("�ݵ�ü����Ѵ�.");
		}
		
	}

	private static void method7() {
		//����ó��
		//1. ���� �Ѵ�. : try - catch - finally
		//2. ���ѱ��. : throws
		try {
			System.out.println("���ܹ߻� ���ɼ��ִ� �����");
			int a = 10/0;
			System.out.println("�̹����� ������Ѵ�.");
		}catch (RuntimeException e) {
			//ArithmeticException -> RuntimeException -> Exception
			System.out.println("���ܹ߻��� �����Ѵ�.");
		}finally {
			System.out.println("�׻� �����Ѵ�. ��������");
			//�ڿ��ݳ��ڵ带 �Ѵ�. : DB�ݱ�, ���ϴݱ�
		}
		
	}

	private static void method6() {
		String s = new String("�ڹ�");
		//�ڵ�����ȯ
		Object s2 = new String("�ڹ�");
		//��������ȯ
		try {
		String s3 = (String)s2;
		Integer i = (Integer)s2;
		}catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void method5() {
		int[] arr = new int[5];
		try {
		System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void method4() {
		try {
			String s = "�ڹ�";
			System.out.println("s�� ���ڼ� : " + s.length());
			s = null;
			System.out.println("s�� ���ڼ� : " + s.length());
		}catch (NullPointerException e) {
			System.out.println("null�� ���Ұ�");
		}
	}

	private static void method3() {
		//Exception ���� : ������ üũ ����, ���� ����(Runtime Exception)
		try {
			Class.forName("com.kosta.day09.review.Button");
			System.out.println("load ����");
		} catch (ClassNotFoundException e) {
			System.out.println("class load ����");
			e.printStackTrace();
		}
	}

	private static void method2(int a, int b) {
		try {
			//���ܹ߻� ���ɼ��ִ� �����
			System.out.println(a/b);
		}catch (ArithmeticException aa) {
			System.out.println("0���� �� ����");
		}

	}

	//������ �߻����� �ʵ��� �������� �߰��� ���� üũ
	//�������� + ����ó������ ���δ�....���� �ڵ� �ƴϴ�.
	//Exception ���
	private static void method1() {
		System.out.println(10/0);

	}

}

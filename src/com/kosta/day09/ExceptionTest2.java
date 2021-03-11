package com.kosta.day09;


//>java ExceptionTest2 10 3
//�ڵ����� ���ܹ߻� -> ����ó���� �����ʾҴٸ� JVM�� ����.
//JVM�� ���ܰ�ü�� ������ش�.
//���α׷��ߴ�
public class ExceptionTest2 {

	public static void main(String[] args) {
		//����� �Ű����� 2���� �޾Ƽ� ��Ģ���� �����Ѵ�.
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}catch (ArrayIndexOutOfBoundsException e) {
			//JVM�� ������� ���ܰ�ü�� �޴´�. ó���Ѵ�.
			System.out.println(e.getMessage());
		}catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}

}

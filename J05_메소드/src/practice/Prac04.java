/*
Q) 	����ڷκ��� �� ���� ������ �Է¹ް�,
   	�Ű������� ���ϰ��� ������ add, sub, mul, div�� �޼ҵ� �߿��� 
   	������ �޼ҵ带 �����Ͽ� �� ���� ���� ����� �� 
   	�ϳ��� ����ϵ��� �ڵ带 �ۼ��Ͻÿ�.

	�� Console1 ��				
    ����1 �Է�: 10
    ����2 �Է�: 20
    ---------------
    �� ���� ���� ����
    ---------------
    1. ��
    2. ��
    3. ��
    4. ������
    ---------------
    ������ �����Ͻÿ�: 2
    ���� ���: -10

    �� Console2 ��
    ����1 �Է�: 10
    ����2 �Է�: 20
    ---------------
    �� ���� ���� ����
    ---------------
    1. ��
    2. ��
    3. ��
    4. ������
    ---------------
    ������ �����Ͻÿ�: 4
    ���� ���: 0.5

*/


package practice;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2 = sc.nextInt();
		
		System.out.println("---------------\r\n"
				+ "�� ���� ���� ����\r\n"
				+ "---------------\r\n"
				+ "1. ��\r\n"
				+ "2. ��\r\n"
				+ "3. ��\r\n"
				+ "4. ������\r\n"
				+ "---------------");
		System.out.print("������ �����Ͻÿ�: ");
		int menu = sc.nextInt();
		
		System.out.print("���� ���: " );
		switch(menu) {
		case 1:
			System.out.println(add(num1, num2));
			break;
		case 2:
			System.out.println(sub(num1, num2));
			break;
		case 3:
			System.out.println(mul(num1, num2));
			break;
		case 4:
			System.out.println(div(num1, num2));
			break;
		}
	}
	
	//���� �޼ҵ� ����
	static int add(int a, int b) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
	
	static int mul(int a, int b) {
		return a * b;
	}
	
	static double div(int a, int b) {
		return (double)a / b;
	}
}











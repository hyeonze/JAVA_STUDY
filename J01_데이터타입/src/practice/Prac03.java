/*
Q)	�� ���� �����غ���.
	����ڷκ��� �� ���� ������ �Է¹޾� ���� ������ �����ϰ�, 
	��¹��� �̿��� �� ���� ���� ����� ��Ÿ������.

	�� Console ��
 	����1 �Է�: 17
	����2 �Է�: 3
	========���� ���========
	����: 20
	����: 14
	����: 51
	���� ��: 5
	���� ������: 2
*/
package practice;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2 = sc.nextInt();
		
		System.out.println("========���� ���========");
		System.out.println("����: " + (num1 + num2));
		System.out.println("����: " + (num1 - num2));
		
		int mul = num1*num2;
		System.out.println("����: " + mul);
		
		int div = num1/num2;
		System.out.println("���� ��: " + div);
		
		int rest = num1%num2;
		System.out.println("���� ������: " + rest);
	}
}


















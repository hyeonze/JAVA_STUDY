/*
Q)	�� ���� ������ �Է¹ް�,	ù ��° ������ �� ��° ������ ����������
	��� �������� ���غ���. 

    �� Console ��
	ù ��° ������ �Է��Ͻÿ�: 10
	�� ��° ������ �Է��Ͻÿ�: 3
	�� ���� ���� ���� 3�̰� �������� 1�Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��Ͻÿ�: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��Ͻÿ�: ");
		int num2 = sc.nextInt();
		
		System.out.println("�� ���� ���� ���� " +num1/num2 + "�̰� �������� " + num1%num2 +"�Դϴ�.");
	}
}








/*
Q)  4���� ������ �Է¹ް�, ��հ��� ����Ͽ� 
	�Ʒ� ȭ��ó�� ����� �������� ����غ���

    �� Console ��
	������ �Է��Ͻÿ�: 10
	������ �Է��Ͻÿ�: 20
	������ �Է��Ͻÿ�: 30
	������ �Է��Ͻÿ�: 40
	����� 25.0�Դϴ�.
	
	�� Console2 ��
	������ �Է��Ͻÿ�: 10
	������ �Է��Ͻÿ�: 14
	������ �Է��Ͻÿ�: 18 
	������ �Է��Ͻÿ�: 20
	����� 15.5�Դϴ�.
`
*/
package practice;

import java.util.Scanner;

public class Prac07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int num1 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int num3 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int num4 = sc.nextInt();
		
		double avg = (num1+num2+num3+num4) / 4.0;
		System.out.println("����� " +avg + "�Դϴ�.");
	}
}












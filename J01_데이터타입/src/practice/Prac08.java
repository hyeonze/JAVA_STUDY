/*
Q)	2���� �Ǽ��� �Է¹޾Ƽ� �� ���� �����κи� ���� ���� ����غ���

    �� Console ��
	ù ��° �Ǽ��� �Է��Ͻÿ�: 1.67
	�� ��° �Ǽ��� �Է��Ͻÿ�: 2.45
	���� �κ��� ���� 3

*/
package practice;

import java.util.Scanner;

public class Prac08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �Ǽ��� �Է��Ͻÿ�: ");
		double num1 = sc.nextDouble();
		System.out.print("�� ��° �Ǽ��� �Է��Ͻÿ�: ");
		double num2 = sc.nextDouble();
		
		int sum = (int)num1 + (int)num2;
		System.out.println("���� �κ��� ���� " + sum);
	}
}






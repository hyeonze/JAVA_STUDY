/*
Q)	���ڸ��� �̷���� ���ڸ� �Է¹ް�, ������ �ڸ����� �и��ؼ� ����غ���

    �� Console ��
	������ �Է��Ͻÿ�: 382
	���� �ڸ����� 3
	���� �ڸ����� 8
	���� �ڸ����� 2

*/
package practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		System.out.println("���� �ڸ����� " + num/100);
		System.out.println("���� �ڸ����� " + (num/10)%10);
//		System.out.println("���� �ڸ����� " + (num%100)/10);
		System.out.println("���� �ڸ����� " + num%10);
	}
}



















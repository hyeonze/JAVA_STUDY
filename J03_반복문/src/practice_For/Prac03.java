/*
Q1) ����ڷκ��� ���� x, y�� �Է¹޾Ƽ�
    x���� y������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

    �� Console ��
	�������� �Է�: 1
	�������� �Է�: 10
	1���� 10������ ���� 55

Q2) Q1�� �ڵ带 �״�� �̿��Ͽ� ������ �����Ͻÿ�.
	x���� y���� 4�� ����鸸 ���� ���� ����Ͻÿ�.
	
	�� Console ��
	�������� �Է�: 10
	�������� �Է�: 40
	10���� 40������ ���� 775
	10���� 40������ 4�� ������� ���� 208
*/
package practice_For;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		//Q1
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է�: ");
		int x = sc.nextInt();
		System.out.print("�������� �Է�: ");
		int y = sc.nextInt();
		
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(x + "���� " + y + "������ ���� " + sum);
		
		//Q2
		int total = 0;
		for (int i = x; i <= y; i++) {
			if (i % 4 == 0) {
				total += i;
			}
		}
		System.out.println(x + "���� " + y + "���� 4�� ������� ���� " + total);
	}
}













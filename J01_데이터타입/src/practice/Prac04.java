/*
Q)  ���� �������� �Է¹ް�, ���� ���̸� ����ؼ� ����غ���.
    (������ pi=3.14)

    �� Console ��
	�������� �Է��Ͻÿ�: 5
	�������� 5�� ���� ���̴� 78.5�Դϴ�
*/
package practice;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ�: ");
		int r = sc.nextInt();
		double pi = 3.14;
		double area = r*r*3.14;
		System.out.println("�������� "+r+"�� ���� ���̴� "+area+"�Դϴ�.");
	}
}

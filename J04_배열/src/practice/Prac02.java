/*
Q)  ���� ������ ������ �迭�� ������ ����ڷκ��� �Է� �ް�,
	�ش��ϴ� �迭�� ������ŭ ������ ��� �Է¹޾� ��հ��� ����Ͽ� 
	�Ʒ� ȭ��ó�� ����� �������� ����غ���.

	�� Console1 ��
	������ �迭�� ����: 2
	������ �Է��Ͻÿ�: 10
	������ �Է��Ͻÿ�: 20
	����� 15.0�Դϴ�.

    �� Console2 ��
	������ �迭�� ����: 5
	������ �Է��Ͻÿ�: 10
	������ �Է��Ͻÿ�: 20
	������ �Է��Ͻÿ�: 25
	������ �Է��Ͻÿ�: 30
	������ �Է��Ͻÿ�: 35
	����� 24.0�Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭�� ����: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		//�迭�� ������ŭ ������ ����ڷκ��� �Է¹ޱ�
		for (int i = 0; i < size; i++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			num[i] = sc.nextInt();
		}
		
		//�迭�� ��� ���� �������� ��հ� ���ϱ�
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += num[i];
		}
		
		//�Ǽ��� Ÿ�� ��ȯ�ؼ� ��հ��
		double avg = (double)sum / size;
		System.out.println("����� " + avg + "�Դϴ�.");
		
	}
}



















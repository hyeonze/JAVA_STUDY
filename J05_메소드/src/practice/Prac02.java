/*
Q)	�־��� ������ ����� ��� ã�Ƴ��� �޼ҵ� 
	show_divisor(int num)�� �ۼ��Ͻÿ�.
    ����ڷκ��� �������� �Է¹޾Ƽ�
    �ش� ������ ����� ��� ����ϴ� �޼ҵ带 ����� �����Ͻÿ�.

	�� Console ��
	���� �Է�: 8
	1 2 4 8
*/
package practice;

import java.util.Scanner;

public class Prac02 {
	//�޼ҵ� ����
	static void show_divisor(int num) {
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i +" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		//�޼ҵ� ȣ��
		show_divisor(n);
	}
}

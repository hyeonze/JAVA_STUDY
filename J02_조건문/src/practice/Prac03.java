/*
Q1) �ڿ����� �Է¹޾Ƽ� Ȧ������ ¦������ �Ǻ��Ͽ� ����Ͻÿ�.

    �� Console ��
	�ڿ����� �Է��ϼ���: 30
	¦���Դϴ�.

Q2) Q1�� �ڵ带 �״�� �̿��Ͽ� ������ �����Ͻÿ�.
    ����ڷκ��� �ι�° �ڿ����� �Է� �޾Ƽ� 
    �� �ڿ����� �հ� ���� ���Ͽ� ����Ͻÿ�.
    ��, �� ���� ���� ������� ����� �������� ����Ͻÿ�.

    �� Console ��
    �ڿ����� �Է��ϼ���: 30
	¦���Դϴ�.
	�ι�° �ڿ����� �Է��ϼ���: 50
	�� �ڿ����� ���� 80
	�� �ڿ����� ���� 20

*/
package practice;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		//Q1
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			//� ���� 2�� ���� �������� 0�̸� ¦��
			System.out.println("¦���Դϴ�.");
		}else {//num1 % 2 == 1
			//� ���� 2�� ���� �������� 1�̸� Ȧ��
			System.out.println("Ȧ���Դϴ�.");
		}
		
		//Q2
		System.out.print("�ι�° �ڿ����� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		System.out.println("�� �ڿ����� ���� " + (num1+num2));
		if(num1 - num2 >= 0) {
			System.out.println("�� �ڿ����� ���� " + (num1-num2));
		}else { //num1 - num2 < 0
			System.out.println("�� �ڿ����� ���� " + (num2-num1));
		}
		
		//if�� �ϳ��� ���
		int sub = num1 - num2;
		if (sub < 0) {
//			sub = num2 - num1;
			sub = -sub;
		}
		
		System.out.println("�� �ڿ����� ���� " + sub);
	}
}


















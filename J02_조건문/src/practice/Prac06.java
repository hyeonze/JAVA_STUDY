/*
Q)  ����ڷκ��� �� ���� ���ڸ� �Է� ���� �� ���� ū ���ڸ� ����϶�.

    �� ����ȭ�� ��
    input num1: 10
    input num2: 9
    input num3: 20
    ���� ū ��: 20

*/

package practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input num1: ");
		int num1 = sc.nextInt();
		System.out.print("input num2: ");
		int num2 = sc.nextInt();
		System.out.print("input num3: ");
		int num3 = sc.nextInt();
		
		//1. ��ø���ǹ� ���
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("���� ū ��: "+num1);
			}else { //num1 <= num3
				System.out.println("���� ū ��: "+num3);
			}
		}else { //num1 <= num2
			if(num2 > num3) {
				System.out.println("���� ū ��: " + num2);
			}else { //num2 <= num3
				System.out.println("���� ū ��: " + num3);
			}
		}
		
		//2. �������� ���
		if (num1 > num2 && num1 > num3) {
			System.out.println("���� ū ��: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("���� ū ��: " + num2);
		} else {
			System.out.println("���� ū ��: " + num3);
		}
		
		//3. �ִ밪 ã�� ���� ����(�ڷᱸ��)
		int max = num1; 
		if(num2 > max) {
			max = num2;
		} //num1�� num2 �� �� ū ���� max�� ����
		
		if(num3 > max) {
			max = num3;
		} //num1, num2���� num3�� �� ũ�� max�� �ش簪 ����
		//num3�� �� ������ if�� ����X
		
		System.out.println("���� ū ��: " + max);
	}
}








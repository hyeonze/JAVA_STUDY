/*
Q)  3���� ������ �Է¹ް� �������� ��հ��� 70�� �̻��̸� ���հݡ�
    �ƴϸ� �����հݡ��� ����Ͻÿ�.

    �� Console ��
	����1 �Է�: 60
	����2 �Է�: 70
	����3 �Է�: 75
	���: ���հ�

*/
package practice;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("����1 �Է�: ");
		int score1 = sn.nextInt();
		System.out.print("����2 �Է�: ");
		int score2 = sn.nextInt();
		System.out.print("����3 �Է�: ");
		int score3 = sn.nextInt();
		
		double avg = (score1+score2+score3)/3.0;
		
		System.out.print("���: ");
		if(avg>=70) {
			System.out.println("�հ�");
		}else {//avg<70
			System.out.println("���հ�");
		}
	}
}












/*
Q)  ����ڷκ��� ����, Ű�� �Է¹��� ��,
    ���̰� 40�� �̻��̰� Ű�� 175�̻��̸� "Ű�� Ů�ϴ�" �� ���
    175�̸��̸� "Ű�� �����Դϴ�."�� ���,

    ���̰� 40�� �̸��̰� Ű�� 180�̻��̸� "Ű�� Ů�ϴ�"�� ���
    180�̸��̸� "Ű�� �����Դϴ�."�� ����Ͻÿ�
    
    �� Console ��
	���̸� �Է��ϼ���: 42
	Ű�� �Է��ϼ���: 175
	Ű�� Ů�ϴ�.

*/
package practice;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���:");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���:");
		int height = sc.nextInt();
		
		//��ø���ǹ� ���
		if (age >= 40) {
			if (height >= 175) {
				System.out.println("Ű�� Ů�ϴ�.");
			} else {
				System.out.println("Ű�� �����Դϴ�.");
			}
		} else {
			if (height >= 180) {
				System.out.println("Ű�� Ů�ϴ�.");
			} else {
				System.out.println("Ű�� �����Դϴ�.");
			}
		}
		
		//�������ڷ� if-else�� �ѹ� ���  
		if ((age >= 40 && height >= 175) || (age < 40 && height >= 180)) {
			System.out.println("Ű�� Ů�ϴ�.");
		} else {
			System.out.println("Ű�� �����Դϴ�.");
		}
	}
}







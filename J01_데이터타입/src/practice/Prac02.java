/*
Q)	������ �Է¹޾Ƽ� �ڱ�Ұ� ����ϱ�
	����(Ÿ��): �̸�(���ڿ�), ����(����), �÷�(�Ǽ�), ���(���ڿ�)
	����ڷκ��� ���� �����͵��� �Է¹޾� ���� ������ �����ϰ�, 
	��¹��� �̿��� �ڱ�Ұ��� ��Ÿ������. 

	�� Console ��
	�̸��� �Է��Ͻÿ�: ����
	���̸� �Է��Ͻÿ�: 21
	�÷��� �Է��Ͻÿ�: 1.5
	��̸� �Է��Ͻÿ�: ��Ʃ��
	========�ڱ�Ұ�========
	�̸�: ����
	����: 21
	�÷�: 1.5
	���: ��Ʃ��

*/


package practice;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = sc.nextInt();
		
		System.out.print("�÷��� �Է��Ͻÿ�: ");
		double sight = sc.nextDouble();
		
		//nextDoube()���� ���� enter�� �Է¹��ۿ� �����ִ� ���� ó��
		sc.nextLine();
		
		System.out.print("��̸� �Է��Ͻÿ�: ");
		String hobby = sc.nextLine();
		
		System.out.println("========�ڱ�Ұ�========");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�÷�: " + sight);
		System.out.println("���: " + hobby);
	}
}


















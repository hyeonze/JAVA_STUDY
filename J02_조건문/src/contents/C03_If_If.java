package contents;

import java.util.Scanner;

public class C03_If_If {
	public static void main(String[] args) {
		//��ø ���ǹ�: if�� �ȿ� ���ο� if���� �߰�
		//��ø ���ǹ� vs ��������
		
		//���̿� Ű�� ���� ž�°��� ���̱ⱸ ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		int height = sc.nextInt();
		
		/* ��ø���ǹ� ��� */
		if (age >= 14) {
			if (height >= 160) {
				System.out.println("�������� ����");
			} else if (height >= 140) {
				System.out.println("�ѷ��ڽ��� ž�� ����");
			} else {// Ű 140�̸�
				System.out.println("�ķ���̵� ž�� ����");
			}
		} else {// 14�� �̸�
			System.out.println("ȸ���� �ö���");
		}
		
		/* �������� ��� */
		if (age >= 14 && height >= 160) {
			System.out.println("�������� ����");
		} else if (age >= 14 && height >= 140) {
			System.out.println("�ѷ��ڽ��� ž�� ����");
		} else if (age >= 14 && height < 140) {
			System.out.println("�ķ���̵� ž�� ����");
		} else { // age < 14
			System.out.println("ȸ���� �ö���");
		}
	}
}







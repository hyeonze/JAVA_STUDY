/*
# if���ǹ�
���ǽ��� ����� ���̸� ���� ���๮���� ����

	if(���ǽ�){
		���๮1
		���๮2
		...
	}
*/
package contents;

import java.util.Scanner;

public class C01_If {
	public static void main(String[] args) {
		/* if�� �������� */
		int a = 10;
		if(a > 5) {
			//���ǽ��� ���� ��� ������ ����, �����̸� ����X
			System.out.println("���ǹ��� ���Դϴ�.");
		}
		System.out.println("���ǹ� ������ �����ϴ� ����");
		
		/* �񱳿����ڿ� if�� */
		int num1 = 10;
		if (num1 >= 50) {
			System.out.println("num1�� 50���� ũ�ų� �����ϴ�.");
		}
		if (num1 < 50) {
			System.out.println("num1�� 50���� �۽��ϴ�.");
		}
		
		int num2 = 200;
		if(num2==100) {//'==' : ���� ����?
			System.out.println("num2�� ���� 100�Դϴ�.");
		}
		if(num2!=100) {//'!=' : ���� �ٸ�?
			System.out.println("num2�� ���� 100�� �ƴմϴ�.");
		}
		
		/* �������ڿ� if�� */
		int num3 = 20;
		if(num3>=50 && num3<=100) { //'&&': AND, �׸���
			System.out.println("num3�� 50�̻��̸鼭 100������ ���Դϴ�.");
		}
		if(num3<50 || num3>100) {//'||': OR, �Ǵ�
			System.out.println("num3�� 50���� �۰ų� 100���� ū ���Դϴ�.");
		}
		
		/* ���ǹ��� boolean���� ���� ���� ��� */
		if(true) {
			System.out.println("������ ����");
		}
		
		if(false) {
			System.out.println("�������� �ʴ� ����");
			System.out.println("����� ��� �޼���");
		}
		
		/* ���๮�� �� ���϶� {}�������� */
		if(num3>0) System.out.println("����¥�� ���๮");
		
		//����: ������ �Է¹޾Ƽ� if������ �հݿ��� ����ϱ� (����:50��)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		if(score>=50) {
			System.out.println("�հ��Դϴ�.");
		}
		if(score<50) {
			System.out.println("���հ��Դϴ�.");
		}
		
		
		
	}
}












/* 	�޴� ��÷�ϱ�
Q)	���� ����ڷκ��� �޴� ������ �Է¹ް�,
	�丮�̸� �� �ܾ �޴��� �Է¹޾� �迭�� �����մϴ�.
	�迭�� �ʱ�ȭ�� ��ġ�� ���� �������� 1���� �޴��� ��÷�Ͽ� ȭ�鿡 ����մϴ�.
	
	�� Console ��
	�޴� ���� �Է�: 5
	�޴�: ���
	�޴�: ���
	�޴�: ������
	�޴�: ¥���
	�޴�: ���뱹
	��÷���Դϴ�...
	��÷�� �޴��� ������ �Դϴ�.
	
	Tip) Random rd = new Random(); 
	ex) 0~9 �߿��� ������ ���� ���: rd.nextInt(10)
*/
package practice;

import java.util.Random;
import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ���� �Է�: ");
		int size = sc.nextInt();
		String[] menu = new String[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("�޴�: ");
			menu[i] = sc.next();
		}
		
		System.out.println("��÷���Դϴ�...");
		Thread.sleep(3000); //3�ʴ��
		
		Random rd = new Random();
		int random = rd.nextInt(menu.length);
		System.out.println("��÷�� �޴��� " +menu[random]+"�Դϴ�.");
		
	}
}












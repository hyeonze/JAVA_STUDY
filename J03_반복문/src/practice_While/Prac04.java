/*
Q)	���ٿ� ������ ����� ���ô�.
	�������� 1~100 ������ ���� ���ڸ� �̸� ����� ����,
	����ڰ� ���ڸ� �Է��Ͽ� ������ ���ߵ��� �ڵ带 �ۼ��Ͻÿ�.
	
	<������ ����>
	[��] ����ڰ� ���亸�� ���� ���� �Է��� ���
	[�ٿ�] ����ڰ� ���亸�� ���� ���� �Է��� ���
	[����] ����ڰ� ����� ���� ���� �Է��� ��� => ���� ���� 
	
	����ڰ� ������ �Է��ϱ� ������ ���ѹݺ��� �Ѵ�.
	���� ����� �� �Է��� Ƚ���� ȭ�鿡 ����Ѵ�.
	
	�� Console ��
	���� �Է�: 50
	[�ٿ�]
	���� �Է�: 25
	[��]
	���� �Է�: 37
	[��]
	���� �Է�: 43
	[�ٿ�]
	���� �Է�: 40
	[�ٿ�]
	���� �Է�: 38
	[����]
	�õ��� �� Ƚ�� = 6
*/
package practice_While;

import java.util.Random;
import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int answer = rd.nextInt(100) + 1;
		int count = 0;
		
		while(true) {
			System.out.print("���� �Է�: ");
			int num = sc.nextInt();
			count++;
			
			if (answer > num) {
				System.out.println("[��]");
			} else if (answer < num) {
				System.out.println("[�ٿ�]");
			} else {
				System.out.println("[����]");
				break;
			}
		}
		System.out.println("�õ��� �� Ƚ�� = " + count);
	}
}













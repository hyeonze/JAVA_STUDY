/* J01 - Prac07 ���� ����
Q)  4���� ������ �Է¹ް�, ��հ��� ����Ͽ� 
	�Ʒ� ȭ��ó�� ����� �������� ����غ���

    �� Console ��
	������ �Է��Ͻÿ�: 10
	������ �Է��Ͻÿ�: 20
	������ �Է��Ͻÿ�: 30
	������ �Է��Ͻÿ�: 40
	����� 25.0�Դϴ�.
	
	�� Console2 ��
	������ �Է��Ͻÿ�: 10
	������ �Է��Ͻÿ�: 14
	������ �Է��Ͻÿ�: 18 
	������ �Է��Ͻÿ�: 20
	����� 15.5�Դϴ�.
*/
package practice_For;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print("������ �Է��Ͻÿ�: ");
//			int num = sc.nextInt();
//			sum += num;
			sum += sc.nextInt();
		}
		
		double avg = sum/4.0;
		System.out.println("����� "+avg+"�Դϴ�.");
	}
}










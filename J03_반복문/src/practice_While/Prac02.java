/*
Q)  ����ڷκ��� ������ �Է¹޾Ƽ� ��� ���ϴ� ���α׷��� �ۼ�����. 
	����ڰ� 0�� �Է��ϸ� ���ݱ��� �Էµ� ��� ������ �հ踦 ����Ѵ�.

    �� Console ��
	���� �Է�: 10
	���� �Է�: 20
	���� �Է�: 30
	���� �Է�: 0
	�հ�: 60

*/
package practice_While;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("���� �Է�: ");
			int num = sc.nextInt();
			sum += num; 
			if(num == 0) {
				break;
			}
		}
		
		System.out.println("�հ�: " + sum);
	}
}















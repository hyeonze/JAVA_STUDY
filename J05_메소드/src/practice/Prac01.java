/*
Q)  ����ڷκ��� ����� Ƚ���� ���ڷ� �Է� �ް�, 
	�Է� ���� ���ڸ�ŭ "Time waits for no one" ���ڿ��� 
	ȭ�鿡 ����ϴ� �޼ҵ带 ����� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.

    �� Console ��
	����� Ƚ�� �Է�: 5
	Time waits for no one
	Time waits for no one
	Time waits for no one
	Time waits for no one
	Time waits for no one
	
    �� Console2 ��
	����� Ƚ�� �Է�: 2
	Time waits for no one
	Time waits for no one
*/
package practice;

import java.util.Scanner;

public class Prac01 {
	//�޼ҵ� ����
	static void showMsg(int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println("Time waits for no one");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� Ƚ�� �Է�: ");
		int times = sc.nextInt();
		
		//�޼ҵ� ȣ��
		showMsg(times);
		
	}
}












/*
Q)  �ݺ������� ����ڿ��� ���ڸ� �Է¹޾Ƽ� ��a���� ������ ī���͸� �ϳ��� �����Ѵ�.
    ����ڰ� ��.���� �Է��ϸ� �ݺ��� �����ϰ� �Էµ� ��a���� �Ѱ����� ����Ѵ�. 

    �� Console ��
	���ڸ� �Է��Ͻÿ�(����� . �Է�): a
	���ڸ� �Է��Ͻÿ�(����� . �Է�): b
	���ڸ� �Է��Ͻÿ�(����� . �Է�): a
	���ڸ� �Է��Ͻÿ�(����� . �Է�): e
	���ڸ� �Է��Ͻÿ�(����� . �Է�): a
	���ڸ� �Է��Ͻÿ�(����� . �Է�): t
	���ڸ� �Է��Ͻÿ�(����� . �Է�): .
	���� a�� 3�� �Է� �޾ҽ��ϴ�.

	Tip) ���� ���� �Է¹ޱ�: char ch = sc.next().charAt(0);
*/

package practice_While;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("���ڸ� �Է��Ͻÿ�(����� . �Է�): ");
			char ch = sc.next().charAt(0);
			if(ch=='a') {
				count++;
			}else if(ch=='.') {
				break;
			}
		}
		
		System.out.println("���� a�� "+count+"�� �Է� �޾ҽ��ϴ�.");
	}
}













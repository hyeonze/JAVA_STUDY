/*
Q)  ����ó�� ����׷����� �׷�����. (���ѷ��� ���)
    ��, -1�� �Է��ϸ� ���α׷��� �����Ѵ�.

    �� Console ��
    ���ڸ� �Է��Ͻÿ�: 5
    *****
    ���ڸ� �Է��Ͻÿ�: 10
    **********
    ���ڸ� �Է��Ͻÿ�: -1
    ���α׷��� �����մϴ�.

*/
package practice_While;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			int length = sc.nextInt();
			for (int i = 0; i < length; i++) {
				System.out.print("*");
			}
			if(length==-1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println();
		}
		
		
	}
}













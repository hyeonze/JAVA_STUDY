/*
Q)  ����ڰ� �Է��� �ڿ����� ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�� Console ��
    �ڿ��� �Է�: 60
    1 2 3 4 5 6 10 12 15 20 30 60
    
*/
package practice_For;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �Է�: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}











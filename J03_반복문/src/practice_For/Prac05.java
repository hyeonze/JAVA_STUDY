/*
Q1) �ڿ����� �Է��ؼ� ���丮�� ���� ���Ͻÿ�.

  	�� Console ��
    ���丮�� �Է�: 5
    5! = 120
 
Q2) Q1�� �ڵ带 �����ϰ� ���ο� �ڵ带 �߰��Ͽ� ������ �����Ͻÿ�. 
	�ڿ����� �Է��ؼ� ���丮�� �������� ������� ����Ͻÿ�.

    ��) 
    5�� �Է��ϸ�
    5 x 4 x 3 x 2 x 1 �������� ���ٷ� ����ϰ�,
    ������� �����ٿ� ����Ѵ�.

    �� Console ��
	���丮�� �Է�: 5
	5 x 4 x 3 x 2 x 1
	5! = 120
    
    �� Console2 ��
	���丮�� �Է�: 7	
	7 x 6 x 5 x 4 x 3 x 2 x 1
	7! = 5040
    
*/
package practice_For;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���丮�� �Է�: ");
		int num = sc.nextInt();
		
		//Q1
//		int fac = 1;
//		for (int i = 1; i <= num; i++) {
//			fac *= i ;
//		}
//		System.out.println(num + "! = " + fac);
		
		//Q2
		int fac = 1;
		for (int i = num; i >= 1; i--) {
			System.out.print(i);
			if(i!=1) {
				System.out.print(" x ");
			}
			fac *= i ;
		}
		System.out.println();
		System.out.println(num + "! = " + fac);
	}
}












/*
Q)  ���� ���ڷ� �Էµɶ� ���� �̸��� ��µǵ��� �غ���.
    ��, ���� �ƴ� ���ڸ� �Է��ϸ� "����!" ��Ʈ�� ��µǵ��� �ۼ��غ���.

    ��)
    12, 1, 2 : winter
    3, 4, 5 : spring
    6, 7, 8 : summer
    9, 10, 11 : fall
    �׿�: ����!
    
    �� Console ��
	���� �Է��ϼ���: 8
	summer
	
	�� Console2 ��
	���� �Է��ϼ���: 20
	����!

*/
package practice;

import java.util.Scanner;

public class Prac08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		int month = sc.nextInt();
		
		//if�� 
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("winter");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("spring");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("summer");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("fall");
		} else {
			System.out.println("����!");
		}
		
		//switch�� 
		switch(month) {
		case 12, 1, 2: //javaSE-14���� ���� (','�� ���� ����)
			System.out.println("winter");
			break;
		case 3, 4, 5:
			System.out.println("spring");
			break;
		case 6, 7, 8:
			System.out.println("summer");
			break;
		case 9, 10, 11:
			System.out.println("fall");
			break;
		default:
			System.out.println("����!");
		}
		
		
		
		
	}
}













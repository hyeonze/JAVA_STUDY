/*
Q)  ������ ������ �Է� �޾� �������� ���� ���ι޴±ݾ��� ���Ͻÿ�.
    5000�� �̻��� 5%
    10000�� �̻��� 10%
    50000�� �̻��� 20%

    �� Console1 ��
	���� �Է�: 8000
	���ι޴±ݾ�: 400
	
	�� Console2 ��
	���� �Է�: 60000
	���ι޴±ݾ�: 12000
	
	�� Console3 ��
	���� �Է�: 3500
	���ι޴±ݾ�: 0

*/
package practice;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int price = sc.nextInt();
		double rate;
		
//		if(price >= 5000 && price < 10000) {
//			rate = 0.05;
//		}else if(price >= 10000 && price < 50000) {
//			rate = 0.1;
//		}else if(price >= 50000) {
//			rate = 0.2;
//		}else {//price < 5000
//			rate = 0;
//		}
		
		if(price>=50000) {
			rate = 0.2;
		}else if(price>=10000) {
			rate = 0.1;
		}else if(price>=5000) {
			rate = 0.05;
		}else {//price < 5000
			rate = 0;
		}
		
		//���� ������ ������ Ÿ�� ��ȯ
		int discount = (int)(price*rate);
		
		System.out.println("���ι޴±ݾ�: " + discount);
		
	}
}















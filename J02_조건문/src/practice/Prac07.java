/*
Q)	�ֻ����� 2�� ������ �ڵ带 ����Ŭ������ �̿��Ͽ� �����ϰ�,
	�� ���� �ֻ��� �հ迡 ���� �Ʒ��� ���� ����� ��Ÿ������ �ڵ带 �ۼ��Ͻÿ�.

	<����� ��>			<���>
	�հ谡 ¦���� ���		¦! 
	�հ谡 Ȧ���� ���		Ȧ! 
	�� ���� ���� ��� 		����! 

	�� Console1 ��
	�ֻ���1: 4
	�ֻ���2: 6
	¦!
	
	�� Console2 ��
	�ֻ���1: 5
	�ֻ���2: 5
	����!
*/
package practice;
import java.util.Random;
public class Prac07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int dice1 = rd.nextInt(6) + 1;
		int dice2 = rd.nextInt(6) + 1;
		
		int total = dice1 + dice2;
		
		System.out.println("�ֻ���1: " + dice1);
		System.out.println("�ֻ���2: " + dice2);
		
		if (dice1 == dice2) {
			System.out.println("����!");
		} else if (total % 2 == 0) {
			System.out.println("¦!");
		} else {
			System.out.println("Ȧ!");
		}
	}
}












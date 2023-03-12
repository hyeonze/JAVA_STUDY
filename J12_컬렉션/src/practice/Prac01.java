/*	list
Q)	���� �ֻ����� 10�� ���� �������� ����Ʈ�� �����Ͽ� ����մϴ�. 
	�׸��� ������ ����� 1~6�� �� �߿��� ������ ���� �Է� �޾� 
	����Ʈ���� �ش��ϴ� ���� ���� ������ �� ��������� ����Ͻÿ�.  

	�� Console ��	
	������: [6, 6, 3, 2, 1, 6, 5, 2, 6, 2]
	������ ���� �Է��ϼ���: 6
	�������: [3, 2, 1, 5, 2, 2]
	
	Tip) �����Ϸ��� ���� �����ؼ� ���� ��쵵 ���� �����ǵ��� ����!

*/
package practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		/* ���1 */
		System.out.println("=====================���1=====================");
		ArrayList<Integer> dice = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int dot = rd.nextInt(6) + 1; //1~6���� ������ �� ����
			dice.add(dot);
		}
		System.out.println("������: " + dice);
		
		//���2�� ����ϱ� ���� ��ü�� �� ����(���� ����)
		ArrayList<Integer> dice2 = (ArrayList<Integer>) dice.clone(); 
		
		System.out.print("������ �� �� �Է��ϼ���: ");
		int del = sc.nextInt();
		
		int checkSize = 10;
		for (int i = 0; i < checkSize; i++) {
			if(dice.get(i) == del) {
				dice.remove(i);
				checkSize--;
				i--;
			}
		}
		System.out.println("�������: " + dice);
		
		/* ���2 */
		System.out.println("=====================���2=====================");
		System.out.println("������2: " + dice2);
		System.out.println("������ ��(1�� ����): " + del);
		
		//while���� contains()�޼ҵ� �̿�
		while(dice2.contains(del)) { //List�� ������ ���� �����ϰ� ������ ��� �ݺ�
			Integer delObj = del; //������ ���� Integer��ü�� ��ȯ(Integer <- int)
			dice2.remove(delObj); //��ü ������ ����
		}
		System.out.println("�������2: " + dice2);
		
	}
}






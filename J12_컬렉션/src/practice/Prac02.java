/*	�ζ� ��÷��ȣ �̱�
Q1) 1~45 �ڿ������� ���� �ߺ����� �ʴ� 6���� �ζ� ��ȣ�� �̾Ƽ�
 	�迭�� �����ϰ� ���� ��ȣ���� ������� ����Ͻÿ�.
 	Tip) ����for���� �̿��Ͽ� �ߺ� ���� ��ȣ�� �����غ���. 
 	
 	�� Console ��	
 	- �ζ� ��÷��ȣ - 		
	8 15 21 31 36 43 

Q2) 1~45 �ڿ������� ���� �ߺ����� �ʴ� 6���� �ζ� ��ȣ�� �̾Ƽ�
 	Set�� �����ϰ� ���� ��ȣ���� ������� ����ϼ���.
 
 	�� Console ��	
	- �ζ� ��÷��ȣ2 -
	11 24 38 41 43 44 
*/
package practice;

import java.util.Random;
import java.util.TreeSet;

public class Prac02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//Q1)
		System.out.println("- �ζ� ��÷��ȣ -");
		//�迭�� �ζ� ��ȣ ����
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;//i���� -1 �ǵ����� ������ȣ�� ���� �̾� �����Ѵ�.
					break;
				}
			}
		}
		
		//�迭�� ������������ �����Ͽ� �����ϱ�
		for (int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {//�������� ���� ����
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int number : num) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		//Q2
		//Set�� �ζǹ�ȣ ����
		System.out.println("- �ζ� ��÷��ȣ2 -");
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while(true) {
			int randNum = rd.nextInt(45) + 1;
			lotto.add(randNum);
			
			//Set�� ������ �ߺ��� �ȵǱ� ������
			//6�� ���� �ڵ������� ���� ��ġ�� �ʴ� ��ȣ�� ����
			if(lotto.size()==6) {
				break;
			}
		}
		
		for(int k : lotto) {
			System.out.print(k + " ");
		}
	}
}






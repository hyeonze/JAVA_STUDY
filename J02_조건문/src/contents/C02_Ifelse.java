/*
# if - else��
���ǽ��� ����� ���� ���೻���� �����Ͽ� ����

	if(���ǽ�){
		(if���ǽ��� ���̸� ����)
		���๮1
		���๮2
		...
	}
	else{
		(if���ǽ��� �����̸� ����)
		���๮3
		���๮4
		...
	}

# if - else if - else 
���ǽ��� �������� ��� ���. else if���� ������ �ۼ� ����.
	
	if(���ǽ�A){
		(���ǽ�A�� ���̸� ����)
		���๮..
	}
	else if(���ǽ�B){
		(���ǽ�A�� �����̰� B�� ���̸� ����)
		���๮..
	}
	else if(���ǽ�C){
		(���ǽ� A,B�� �����̰� C�� ���̸� ����)
		���๮..
	}
	...
	else{
		(���� ��� ���ǽĵ��� �����̸� ����)
		���๮
	}
	
- else���� �������� �ѹ��� �ۼ� ����
- else���� ������ ���� ���ǹ� �� �ϳ��� ������ ����

*/
package contents;

import java.util.Scanner;

public class C02_Ifelse {
	public static void main(String[] args) {
		/* if-else�� */
		int num1 = -20;
		if (num1 >= 50) {
			//if���ǽ��� ���� ��� ������ ����
			System.out.println("num1�� 50���� ũ�ų� �����ϴ�.");
		}
		else{// num1 < 50
			//if���ǽ��� ������ ��� ������ ����
			System.out.println("num1�� 50���� �۽��ϴ�.");
		}
		
		//����: � ���� 3�� ������� �ƴ��� ����ϱ�
		int num = 29;
		if(num % 3 == 0) { //� ���� 3���� ���� �������� 0�̸� �� ���� 3�� ����̴�. 
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		/* else if�� */
		int num2 = 30; 
		if(num2 > 50) {
			System.out.println("num2�� 50���� Ů�ϴ�.");
		}else if(num2 == 50) {
			System.out.println("num2�� 50�Դϴ�.");
		}else { //num2 < 50
			System.out.println("num2�� 50���� �۽��ϴ�.");
		}
		
		//� ������ ���, 0 �� ��� �ش��ϴ��� ����ϱ�
		int numI = 30;
		if(numI > 0 ) {
			System.out.println(numI+"(��)�� ����Դϴ�.");
		}else if(numI == 0) {
			System.out.println(numI+"(��)�� 0�Դϴ�.");
		}else {//numI < 0 
			System.out.println(numI+"(��)�� �����Դϴ�.");
		}
		
		//����: ������ �Է� �޾Ƽ� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {// score<60
			System.out.println('F');
		}
		//�ڵ� �ڵ�����: ctrl + shift + f
		
	}
}










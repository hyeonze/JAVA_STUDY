/*
# while �ݺ���
while���� ���ѹݺ� Ȥ�� �ݺ��� Ƚ���� �������� �ʾ����� ����Ѵ�.

	while(���ǽ�){
		�ݺ��� ���๮..
	}
	
- ���ǽ��� ���̸� ����ؼ� �ݺ��� ����
- ���ǽ��� ������ �Ǹ� �ݺ� ����

# break Ű����
�ݺ����� ��������. Ż��(exit)
if���� �Բ� ���

# continue Ű����
�ݺ��� ó������ ���ư�
continue �����ٺ����� ���๮�� ��ŵ

*/
package contents;

import java.util.Scanner;

public class C05_While {
	public static void main(String[] args) {
		/* while �ݺ��� */
		//5�� �ݺ��ϱ�
		int i = 1;
		while(i<=5) {
			System.out.println("�ݺ�"+i);
			i++;//������ ���ѹݺ� ����
		}
		
		//1~10���� �ڿ��� ����ϱ�
		int w = 1;//���۰�(for�� �ʱ��)
		while (w <= 10) {// ���ǽ�
			System.out.println(w);
			w++;// ������
		}
		
		//7~0���� ���� ����ϱ�
		int j = 7;
		while(j>=0) {
			System.out.println("j = "+j);
			j--;
		}
		
		//1~10���� �ڿ��� �� ���ϱ�
		int k = 1, sum = 0;
		while(k<=10) {
			sum += k;
			k++;
		}
		System.out.println("sum = " + sum);
		
		/* break Ű���� */
		//5�� �ݺ��ϱ�
		int b = 1;//���۰�
		while(true) {
			System.out.println("�ݺ�"+b);
			if(b>=5) {//���ǽ�
				break;//�ݺ��� Ż��
			}
			b++;//������
		}
		
		//1~20������ Ȧ�� ����ϱ�
		int p = 1;
		while(true) {
			if(p%2==1) {
				System.out.print(p+" ");
			}
			if(p==20) {
				break;
			}
			p++;
		}System.out.println();
		
		//�Է¹޾Ƽ� while�� Ż���ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�ݺ��� ���߷��� -1�� �Է��ϼ���: ");
			int quit = sc.nextInt();
			if(quit == -1) {
				System.out.println("�ݺ��� �����մϴ�.");
				break;
			}
		}
		
		/* continue Ű���� */
		//10~30���� 5�ǹ�� �����ϰ� ����ϱ�
		int c = 10;
		while(c<=29) {
			c++;
			if (c % 5 == 0) {
				//5�� ����� ��� continue�� �ݺ��� ó������ ���ư�
				continue;
			}
			System.out.print(c+" ");
		}
	}
}
























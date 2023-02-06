/*
# Random Ŭ����
������ ���� �����ϴ� ����� ����
���ϴ� ���������� ������ �������� ������ �ʿ��ϴ�. 
	
	"Random" + ctrl + space
	-> import java.util.Random;
	
	Random ��ü�̸� = new Random();

# ���� ���� ����
	��ü�̸�.nextInt(����) + ���۰�;

*/
package contents;

import java.util.Random;

public class API_Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//int�� �������� ������ ���� ����
		System.out.println(rd.nextInt());
		
		/* ���� ���� ��� */
		//0~9 ������ ���� ���(0�̻� 9����)
		System.out.println(rd.nextInt(10));
		
		//1~10 ������ ���� ���(1�̻� 10����)
		System.out.println(rd.nextInt(10) + 1);
		
		//10~20 ������ ���� ���
		System.out.println(rd.nextInt(11) + 10);
		
		//1~45 ������ ���� ���
		int lotto = rd.nextInt(45) + 1;
		System.out.println(lotto);
		
		//����: �ֻ����� ������ ���� ���� ����ϰ�,
		//	   �ش� ���� 6�� ������� ���ε� ����Ͻÿ�
		int dice = rd.nextInt(6) + 1;
		System.out.println("�ֻ����� ��: " + dice);
		if(6 % dice == 0) {
			System.out.println("6�� ����Դϴ�.");
		}else {
			System.out.println("6�� ����� �ƴմϴ�.");
		}
	}
}















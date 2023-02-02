/*
# �ڷ���(Data Type)
("�ڷ���" = "������ Ÿ��" = "Ÿ��")
������ ������ �� ���Ǵ� Ű����
�ڷ������� �������� Ÿ�԰� ũ�⸦ ���Ѵ�. 
�⺻ Ÿ��: byte, short, int, long, float, double, char, boolean

1. ���� �ڷ���
���� ����, 0, ���� ������ �����ϴ� �ڷ���
�Ҽ��� ����X
	int age = 25;
	
����Ÿ��	ũ��
byte		1byte
short	2byte
int		4byte	�Ϲ�����
long		8byte	Ȯ����

2. �Ǽ� �ڷ���
�Ҽ����� ������ �Ǽ��� �����ϴ� �ڷ���
	double weight = 68.5;

�Ǽ�Ÿ��	ũ��
float	4byte	�����
double	8byte	�Ϲ�����

3. ���� �ڷ���
�ϳ��� ���ڸ� �����ϴ� �ڷ���. character
�ܵ���ǥ('') �ȿ� ǥ��!
	char grade = 'A';

char		2byte

4. ���ڿ� �ڷ���
���ڿ��� �����ϴ� Ŭ���� ���� Ÿ��(�⺻ Ÿ��X)
�ֵ���ǥ("") �ȿ� ǥ��
	String name = "hyun";

5. �� �ڷ���
��/���� �����͸� �����ϴ� �ڷ���
	boolean cold = true;
	boolean hot = false;

boolean	1byte

# bit(binary digit)
��ǻ���� �����͸� ��Ÿ���� �ּ� ����
1bit�� 0�̳� 1 �� �� �ϳ��� ��
1byte = 1bit X 8 

*/
package contents;

public class C02_DataType {
	public static void main(String[] args) {
		/* 1. ���� �ڷ��� */
		byte by = 10;
		short sh = 20;
		int numI = 30;
		long numL = 40;
		System.out.println(by);
		System.out.println(sh);
		System.out.println(numI);
		System.out.println(numL);
		
//		numI = 12345678901; //����: �����÷ο� 
		numL = 12345678901L; //����L: longŸ������ ��ȯ 
		System.out.println(numL);
		
		/* 2. �Ǽ� �ڷ��� */
		double numD = 3.14;
		float numF = 3.14f; //����f: floatŸ������ ��ȯ
		System.out.println(numD);
		System.out.println(numF);
		
		/* 3. ���� �ڷ��� */
		char ch1 = 'k';
		System.out.println(ch1);
		char ch2 = '��';
		System.out.println(ch2);
		char ch3 = 65; //��ǻ�ʹ� ���ڵ� �����δ� ���ڷ� ����Ǿ� �ִ�.
		System.out.println(ch3); //'A'�� �ƽ�Ű�ڵ� 10������ 65
		
		/* 4. ���ڿ� �ڷ��� */
		String str1 = "happy wedding";
		String str2 = "happy new year!";
		System.out.println(str1);
		System.out.println(str2);
		
		/* 5. �� �ڷ��� */
		boolean cold = true;
		boolean hot = false;
		System.out.println(cold);
		System.out.println(hot);
	}
}












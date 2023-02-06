/*
# Ÿ�� ��ȯ(Casting)
("Ÿ�Ժ�ȯ" = "ĳ����" = "�ڷ��� ��ȯ" = "����ȯ")
������ Ÿ���� ��ȯ��Ų��.
	(�ڷ���)������
	
�ڷ��� ����: byte < short/char < int < long < float < double

1. �ڵ� Ÿ�� ��ȯ(��ĳ����)
	ū ���� Ÿ�� <= ���� ���� Ÿ��
���� Ÿ���� ū Ÿ�Կ� ������ �� �ڵ����� Ÿ���� ��ȯ�ȴ�. 

2. ���� Ÿ�� ��ȯ(�ٿ�ĳ����, ���� Ÿ�� ��ȯ)
	���� ���� Ÿ�� <= (Ÿ�Ժ�ȯ)ū ���� Ÿ��
ū Ÿ���� ���� Ÿ�Կ� ������ �� ����ڰ� �������� (Ÿ�Ժ�ȯ)�� �ۼ��ؾ� �Ѵ�.
Ÿ�� ��ȯ�� ���ϰ� �����ϴٸ� ����.
=> Ÿ�Ժ�ȯ�� �����Ͱ��� �Բ� ������� ����!

3. ���ڿ� ������ ���ڸ� ���� �Ǵ� �Ǽ��� ��ȯ
	int numI = Integer.parseInt(str1);
String Ÿ���� ��ġ �����Ͱ� �ƴϱ� ������ cast�����ڸ� ���X
WrapperŬ������ ����� �̿�

*/
package contents;

public class C05_Casting {
	public static void main(String[] args) {
		/* 1. �ڵ� Ÿ�� ��ȯ */
		double a = 1; //���� 1�� doubleŸ�Կ� ����
		System.out.println(a); //�Ǽ�(1.0)���� �ڵ� Ÿ�� ��ȯ
		
		int num1 = 20;
		double num2 = num1; //�ڵ����� Ÿ���� ��ȯ�Ǿ� ����ȴ�.
		System.out.println(num2);
		
		int b = 'A'; //���Ϲ��ڸ� ���ڷ� �ڵ� Ÿ�� ��ȯ�Ͽ� ����
		System.out.println(b); //����A�� �ƽ�Ű�ڵ� ������ 65
		System.out.println("======");
		
		/* 2. ���� Ÿ�� ��ȯ */
		int c;
//		c = 1.5; ����: intŸ���� ������ ������ �� �ֱ� ����
		c = (int)1.5; //������ Ÿ�� ��ȯ�� �ؼ� �����ؾ� �Ѵ�. 
		System.out.println(c); //�Ҽ��� ���� ����, ������ �ս� �߻�
		
		/* cast������ �̿� */
		int numA = 10;
		int numB = 4;
		double numC = numA / (double)numB;
		System.out.println(numC);
		System.out.println("=======");
		
		/* 3. ���ڿ� ���ڸ� ���� �Ǵ� �Ǽ��� ��ȯ */
		String str1 = "100";
//		int numI = str1; ����: Ÿ�� ����ġ
		
		int numI = Integer.parseInt(str1);
		System.out.println(numI+50);
		
		String str2 = "12.34";
		double numD = Double.parseDouble(str2);
		System.out.println(numD+0.5);
		
		System.out.println(str1 + str2); //���ڿ� �̾����
		System.out.println(numI + numD); //���� ����
	}
}








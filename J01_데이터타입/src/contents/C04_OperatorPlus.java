/*
# ��� ������(��Ģ ������)
+ : ���� ������
- : ���� ������
* : ���� ������

/ : ������ ������
 	������ ���� ���ϴ� ������
 	����/���� = ����
 	�Ǽ�/�Ǽ� = �Ǽ�

% : ������ ������
	������ �������� ���ϴ� ������
	
A �� B = ��(/) ~ ������(%)
7 �� 3 = 2 ~ 1	
14 �� 3 = 4 ~ 2

*/
package contents;

public class C04_OperatorPlus {
	public static void main(String[] args) {
		/* ��������� Ȯ���ϱ� */
		System.out.println(3 + 5);
		System.out.println(3 - 5);
		System.out.println(3 * 5);
		System.out.println(5 / 2);
		System.out.println(5 % 2);
		System.out.println();
		
		/* ���꿡�� �� �� �ϳ��� �Ǽ��� ����� �Ǽ� */
		System.out.println(5.0 / 2.0); //�Ǽ� ������ ����
		System.out.println(5 / 2.0); //�Ǽ� ������ ����
		System.out.println(5.0 / 2);
		System.out.println(10.0 + 4);
		System.out.println(5 * 4.0);
		
		int kor, eng, math;
		kor = 77;
		eng = 80;
		math = 85;
		
		int sum = kor + eng + math;
		System.out.println("����: " + sum);
		
		//�Ǽ� ������� ��� ���� �� �� �ϳ��� �Ǽ��� Ÿ�� ��ȯ
		double avg = (double)sum / 3;
		System.out.println("���: " + avg);
		double avg2 = sum / 3.0;
		System.out.println("���2: " + avg2);
	}
}









/*
# ���迬����(�񱳿�����)
>, >=, <, <=, ==, !=
�� ���� ���� ����� �� �Ǵ� �������� �����Ѵ�.

== : ���� ����. 
!= : ���� �ٸ���. 

a == b : a�� b�� ������ true, �ٸ��� false
a != b : a�� b�� �ٸ��� true, ������ false

*/
package contents;

public class C06_OperatorCompare {
	public static void main(String[] args) {
		//��Ÿ�� boolean�� true, false ��Ÿ����.
		
		/* ���迬���� Ȯ���ϱ� */
		int n = 10;
		
		boolean b1 = n > 5;
		System.out.println("b1 = " + b1);
		
		boolean b2 = n <= 18;
		System.out.println("b2 = " + b2);
		
		boolean b3 = n == 9;
		System.out.println("b3 = " + b3);
		
		boolean b4 = n != 9;
		System.out.println("b4 = " + b4);
		
		System.out.println(100>50);
		System.out.println(100!=50);
	}
}







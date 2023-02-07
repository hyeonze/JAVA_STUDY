/*
# ���� ���� ������
+=, -=, *=, /=, %=
��������ڿ� ���Կ����ڰ� ������ ����
���(���ǹ�, �ݺ���)���� ���� ���

��= : ������ ���� ������ �� ���� ������ ����
a ��= 10 <=> a = a �� 10
ex) a += 10 <=> a = a + 10;

# ������(Operator)�� ����
���� ������(=)
��� ������(+,-)
���� ������(>=,==,<)
�� ������(&&,||)
���� ���� ������(+=,-=)
*/
package contents;

public class C02_OperatorAssign {
	public static void main(String[] args) {
		/* ���� ���� ������ */
		int a = 100;
		
		a += 10; //a = a + 10;  
		System.out.println(a);
		
		a -= 10; //a = a - 10;
		System.out.println(a);
		
		a *= 5; //a = a * 5;
		System.out.println(a);
		
		a /= 50; //a = a / 50;
		System.out.println(a);
		
		a %= 4; //a = a % 4;
		System.out.println(a);
		
		//1~10������ �ڿ��� �� ���ϱ�
		int sum = 0; //�� ���� ������ ���� ����
		for (int i = 1; i <= 10; i++) {
			sum += i; //sum = sum + i
			System.out.println("������ sum��: " + sum);
		}
		System.out.println("sum: " + sum);
		
		//1~20���� 4�� �ǳʶٸ鼭 ���
		for (int i = 1; i <= 20; i += 4) {
			System.out.print(i + " ");
		}System.out.println();
		
		//1~50���� 3�� ��� ���
		for (int i = 3; i <= 50; i += 3) {
			System.out.print(i + " ");
		}
	}
}






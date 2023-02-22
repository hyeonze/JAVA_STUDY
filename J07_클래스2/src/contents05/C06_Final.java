/*
# final
final ������ �� �� �ʱⰪ�� ����Ǹ� ���Ŀ� ���� �Ұ���
	final Ÿ�� ������;

# ��� ����
	static final Ÿ�� ����� = �ʱⰪ;
	
������� ��� �빮�ڷ� �ۼ��ϴ� ���� ��Ģ

*/
package contents05;

public class C06_Final {
	static final int TEN = 10; //��� ����
	
	public static void main(String[] args) {
		/* final Ű���� */
		Last order = new Last(5);
		System.out.println(order.b);
		System.out.println(order.c);
		
//		order.c = 50; //����: �ʱ�ȭ�� final������ ���� �Ұ�
		
		final int k;
		k = 10;
//		k = 20; ����: final���� �� ���� �Ұ�
		
		/* ��� ����ϱ� */
		System.out.println(order.PI);
		System.out.println(Last.PI);
		
		int[] arr = new int[TEN];
		System.out.println(arr.length);
		
		//intŸ������ ����� �� �ִ� ������ �ִ밪, �ּҰ���
		//IntegerŬ������ ����� ����Ǿ� �ִ�.
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("MAX_VALUE: " + max);
		System.out.println("MIN_VALUE: " + min);
//		int check = 2147483648;
	}
}







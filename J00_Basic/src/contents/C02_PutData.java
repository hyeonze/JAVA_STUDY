package contents;

public class C02_PutData {
	public static void main(String[] args) {
//		= : ���Կ�����
//		�������� �����͸� ���� ��� �����Ѵ�.
//		cf) ������ '=='
		
		int a;
		a = 10;//���� ����
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		b = a;//a���� b�� ����
		System.out.println(b);
		b = a + 100;//(a+100)�� ����� b�� ���� 
		System.out.println(b);
		a = b = 50; //50�� b�� ������ �� b���� a�� ����
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		String c;
		c = "���ڿ�����"; //c�� ���ڿ� ������ ����
		System.out.println(c);
	}
}

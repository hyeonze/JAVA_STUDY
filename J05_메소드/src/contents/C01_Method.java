/*
# �޼ҵ�(Method)
Ŭ���� ������ ����� �Լ�(function)
�޼ҵ�� � ���(�۾�)�� �����ϴ� ���๮���� �����̴�. 

1. �޼ҵ� ����
	����Ÿ�� �޼ҵ��̸�(�Ű���������){
		���๮..
	}

�޼ҵ� �����Ͽ� '�޼ҵ��̸�'�� � ��ɵ��� �����ϵ��� ���س��´�.

2. �޼ҵ� ����
	�޼ҵ��̸�(�Ű�����..);
	
# return��
�޼ҵ� ���� ����Ÿ�� �ִ� �޼ҵ�� ���Ϲ����� ���ϰ��� �����ؾ� �Ѵ�.
	return ���ϰ�;

# ����Ÿ�� (���)
����Ÿ���� ���ϰ��� Ÿ��
���ϰ��� �޼ҵ带 ������ �� ��ȯ�Ǵ� ������̴�.
void: ���ϰ��� ���� �޼ҵ��� ����Ÿ��

# �Ű����� (�Է�)
�޼ҵ带 ������ �� �ʿ��� �����͸� �ܺηκ��� �Է� �ޱ� ���� ����
�Ű������� 0�� �Ǵ� ������ ���� ����

# �޼ҵ� ����� �帧
(�Է�) -> �޼ҵ� -> (���)
(�Ű�����) -> �޼ҵ� -> (���ϰ�)

*/
package contents;

public class C01_Method {
	public static void main(String[] args) {
		/* ���� Ÿ�Կ� ���� �޼ҵ� ���� */
		int a = outTen();//�޼ҵ��̸����� ȣ��
		System.out.println(a);;;
		
		int b = outFive();
		System.out.println(b);
		
		double c = outPI();
		System.out.println(c);
		
		char d = charK();
		System.out.println(d);
		
		String e = valen();
		System.out.println(e);
		
		noReturn(); //���ϰ� ���� �޼ҵ� ȣ��
		
		/* �Ű������� �̿��� �޼ҵ� ���� */
		int num1 = 50;
		int num2 = 20;
		
		//���ް�: a<=50
		int f = addTen(50);
		System.out.println(f);
		int f2 = addTen(num1);
		System.out.println(f2);
		
		//���ް�: a<=50, b<=20
		int g = sub(num1, num2);
		System.out.println(g);
		System.out.println(sub(num1, 40));
		
		//���ް�: a<=num1, b<=num2, c<=20
		double numAvg = avg(num1, num2, 20);
		System.out.println(numAvg);
		
		//�޼��� ������ �־��� Ƚ����ŭ ������ִ� �޼ҵ� ����
		msgRepeat("������ �߿���", 3);
		msgRepeat("�߷�Ÿ�̵���", 2);
	}
	
	//�޼ҵ� �����ϱ�
	static int outTen() {
		return 10;
	}
	
	/* ���� Ÿ�Կ� ���� �޼ҵ� ���� */
	//������ ���� Ÿ��
	static int outFive() {
		return 5;
	}
	
	//�Ǽ��� ���� Ÿ��
	static double outPI() {
		return 3.14;
	}
	
	//���� ���� Ÿ��
	static char charK() {
		return 'K';
	}
	
	//���ڿ� ���� Ÿ��
	static String valen() {
		return "�߷�Ÿ�̵���";
	}
	
	//���ϰ��� ���� �޼ҵ�
	static void noReturn() {
		//���� �ڵ常 �����ϰ� ��ȯ�Ǵ� ���� ����.
		System.out.println("���ϰ��� ���� �޼ҵ�");
	}
	
	/* �Ű������� �̿��� �޼ҵ� ���� */
	//�Ű����� 1��
	static int addTen(int a) {
		return a+10;
	}
	
	//�Ű����� 2��
	static int sub(int a, int b) {
		return a-b;
	}
	
	//�Ǽ��� ����Ÿ��, ������ �Ű����� 3��
	static double avg(int a, int b, int c) {
		return (a+b+c)/3.0;
	}
	
	//�޼ҵ� ���: �޼��� ������ �־��� Ƚ����ŭ ������ִ� �޼ҵ�
	//���ϰ� ����, �Ű������� ���ڿ��� ����Ÿ�� 1����
	static void msgRepeat(String msg, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(msg);
		}
	}
}










/*
# ������ ���� ����
������ ������ ������ {} ���ο����� ���� �����ϴ�.
*/
package contents;

public class C03_VariableArea {
//	static int k = 10;
	public static void main(String[] args) {
//		System.out.println(k);
		
		//for������ ������ ���� ����
		int a = 10;
		for (int i = 0; i < 10; i++) {
			int b = 10;//b�� for�� ���ο����� ����, ��밡���� ����
			a++;
			b++;
			System.out.println("(a,b): ("+a+","+b+")");
		}
		System.out.println("for�ܺ� a: " + a);
//		System.out.println("for�ܺ� b: " + b);
//		����: for�� ���ο��� ���� ���� b�� for���� ������ ��������.
		
		//for������ ������ �� ������Ű��
		int numA = 0;
		int numB = 0;
		for (int i = 0; i < 10; i++) {
			numA++;//�ݺ��� ����
			numB += i;//�ݺ��� i�� ����
		}
		System.out.println("numA ������: " + numA);
		System.out.println("numB ������: " + numB);
		
		//if��
		int d;
		if(true) {
			int c = 100;
			System.out.println("if���� c: "+c);
			d = c;
		}
		System.out.println("if�ܺ� c: "+d);
		
	}
}















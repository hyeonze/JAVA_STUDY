/*
# ����(variable)
�����͸� �����ϴ� �޸� ������ �̸��� ����
������ ������ �� 2���� �ʿ�
- �ڷ���(DataType): int, double, String..
- ������

# ���� ����� �ʱ�ȭ
1. ���� ����
������ �ڷ����� �̸��� ����� �۾�
	�ڷ��� ������;
	
2. �ʱ�ȭ
�Ҵ���� ���������� ���ʷ� �����Ͱ��� �ִ� �۾�
	������ = ������;
	
0. ���� ����� ���ÿ� �ʱ�ȭ
 	�ڷ��� ������ = ������;
 	
# ������ �ۼ���Ģ
1) ���ĺ�, ����, �ѱ�, '_', '$'�� ����
2) ��ҹ��� ������
3) ���ڷ� ������ �� ���� ex) 24hour
4) �����̳� Ư����ȣ ���Ұ� ex) @, #
5) �ڹ� ����� ���Ұ� ex) public, class
+) ���� �̸�: ù���ڸ� �ҹ��� ���� ��Ģ.
   ��� �̸�: ���� �빮�� ��Ģ
   
# ���(constant)
�׻� ���� ���� �����ϴ� ����. �����Ͱ� ����X

*/
package contents;

public class C01_Variable {
	public static void main(String[] args) {
		/* ���� ����� �ʱ�ȭ */
		int num1; //���� ����
		num1 = 10; //���� �ʱ�ȭ
		System.out.println(num1); //num1�� �����Ͱ� ���
		
		int num2 = 20; //���� ����� ���ÿ� ���� �ʱ�ȭ
		System.out.println(num2);
		
		num2 = 30; //������ ����
		System.out.println(num2);
		
		num2 = num1; //������ �ٸ� ������ ����
		System.out.println(num2);
		
		int num3 = num1; //���� �ʱ�ȭ���� �ٸ� ���������� ����
		System.out.println(num3);
		System.out.println("=======");
		
//		num4 = 50; ����: �ڷ����� ����Ǿ� ���� ����
		int num4 = 50;
		
		int a, b, c;//���� �ڷ����� ���� �������� ���ÿ� ����
		a = 100;
		b = 200;
		c = a + b;
		System.out.println(c);
		System.out.println(a+b);
		System.out.println(a-b);
		
		/* ���� �۸� ��Ģ */
		int show_me_the_$;
		int �ѱ۵�����������;
//		int 2someplace; ���ڽ���X
//		int ko rea; ����X
//		int mail@naver; Ư����ȣX
//		int public; �ڹ� ���Ǿ�X
		
		/* ������ �ܾ�� ������ ���鶧 */
		int icecream_waffle; //�ܾ� ���̿� �����(_)
		int chocoWaffle; //�ι�° �ܾ� �빮�� ����
	}
}














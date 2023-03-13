/*
# ����
������� �߸��� �ڵ� �ۼ����� ���� ���α׷� �����߿� ����ġ ���ϰ� �߻��ϴ� ����
����ڰ� �ذ��� �� �ִ� �����̴�.
cf) ����(error): �ڹ� ���� �ӽſ��� �߻��ϴ� ����. ����ڰ� �ذ�X
				������ �߸� �ۼ��� �ڵ�� �����Ϸ��� ���� ������ ������ �ɷ�����.

# ����ó��
���ܰ� �߻��ϴ��� ���α׷��� ���۽����� ������� �ʰ�,
��� �����ų�� �ֵ��� ���ܸ� ó������ �� �ִ�. 

# try ~ catch ����ó�� ���
	try{
		���� �߻� ���ɼ� �ִ� �ڵ�
	} catch(����Ŭ������ e){
		���� ó�� �ڵ�
	} finally{
		������ ����
	}

# ��ǥ���� ����
ArithmeticException: ������ 0���� ���� �� �߻�
InputMismatchException: Scanner�� �Է¹��� �� �־��� ���İ� ���� �ʰ� �Է��ϸ� �߻�
ArrayIndexOutOfBoundsException: �迭�� ������ ����� ������ ��� �߻�
Exception: ��� ���ܸ� ����ִ� Ŭ����
*/
package contents;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exception {
	public static void main(String[] args) {
		/* ���� ó���ϱ� */
		System.out.println("���� ����");
		int num1 = 10;
		int num2 = 0;
		
//		System.out.println(num1/num2);
//		���� �� ���� �߻�. ������ ������ �����ְ� �ڹ� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		//��ǥ���� ���ܵ� ó���غ���
		try {
//			int[] num = new int[2];
//			System.out.print("����1 �Է�: ");
//			num[0] = sc.nextInt();
//			System.out.print("����2 �Է�: ");
//			num[1] = sc.nextInt();
////			System.out.print("����3 �Է�: ");
////			num[2] = sc.nextInt();
//			
//			System.out.println("num[0]/num[1] = " + num[0]/num[1]);
//			System.out.println("@@@@@@@@@@@@");
		}catch(ArithmeticException e) {
			System.err.println("������ 0���� ���� �� �����ϴ�.");
			e.printStackTrace(); //������ �߻���ġ�� ���
		}catch(InputMismatchException e) {
			System.err.println("������ �ƴ� Ÿ���� �Է¹��� �� �����ϴ�.");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭�� ������ ��� �����Դϴ�.");
			e.printStackTrace();
		}finally {
			System.out.println("���ܿ� ������� ������ ����");
		}
		
		//Exception Ŭ����
		try {
			int[] num = new int[2];
			System.out.print("����1 �Է�: ");
			num[0] = sc.nextInt();
			System.out.print("����2 �Է�: ");
			num[1] = sc.nextInt();
			System.out.println("num[0]/num[1] = " + num[0]/num[1]);
		}catch(Exception e) {
			System.err.println("���� �߻�");
			e.printStackTrace();
		}
	}
}











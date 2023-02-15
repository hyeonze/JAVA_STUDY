/*
# �⺻ Ÿ��(Primitive type)
	int, double, char, boolean..
�⺻ Ÿ���� ������ ������(��)�� ���� �����ϴ� Ÿ���̴�. 

# ���� Ÿ��(Reference Type)
	int[], char[], String, class, interface..
���� Ÿ���� ��ü�� �ּҸ� �����ϴ� Ÿ���̴�. 
���� Ÿ���� ������ ������(��)�� ���� �������� �ʰ�,
���� �����͸� �����ϰ� �ִ� �ٸ� ������ ��ü�� �����Ѵ�.

�迭: ���� �ڷ����� ������ �����͸� ��� �����ϴ� ���� �ڷ���

*/
package contents;

import java.util.Arrays;

public class C04_ReferenceType {
	public static void main(String[] args) {
		/* �⺻ �ڷ��� */
		int a = 10;
		int b = 10;
		System.out.println(a==b);//�⺻Ÿ�� ���� ���� �� ��
		
		/* ���� �ڷ��� */
		int[] arr = {10, 20, 30};
		int[] brr = {10, 20, 30};
		System.out.println(arr==brr);//����Ÿ�� ���� ���� �ּҰ� ��
		System.out.println(arr[0]==brr[0]);//������ �� ��
		System.out.println("arr: " + arr);
		System.out.println("brr: " + brr);
		System.out.println(Arrays.toString(arr));//�迭 ������ Ȯ��
		System.out.println(Arrays.toString(brr));
		
		String str1 = new String("winter");
		String str2 = new String("winter");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println(str1==str2);//����Ÿ�� ���� ���� �ּҰ� ��
		System.out.println(str1.equals(str2));//���ڿ� ��
		
		/* �迭�� �ʱⰪ */
		//����Ÿ�� ������ �ش� ������ Ÿ���� ����Ʈ���� ����Ǿ� �ִ�. 
		//������ Ÿ���� ����Ʈ��(�⺻��)�� null�̴�.
		int num;
		int[] arrInt = new int[3];
		double[] arrDoub = new double[3];
		char[] arrChar = new char[3];
		boolean[] arrBool = new boolean[3];
		String[] arrStr = new String[3];
		
//		System.out.println(num); ����: �⺻Ÿ�� ������ �ʱⰪ�� ����.
		System.out.println(Arrays.toString(arrInt));
		System.out.println(Arrays.toString(arrDoub));
		System.out.println(Arrays.toString(arrChar));
		System.out.println(Arrays.toString(arrBool));
		System.out.println(Arrays.toString(arrStr));
		
		/* �⺻ Ÿ���� null�� ������ �� ����. */
//		int num = null;
		int[] arrNum = null;
		System.out.println(arrNum);
		String msg = null;
		System.out.println(msg);
	}
}









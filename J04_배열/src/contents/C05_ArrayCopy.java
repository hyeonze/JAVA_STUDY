package contents;

import java.util.Arrays;

public class C05_ArrayCopy {
	public static void main(String[] args) {
		//����Ÿ�԰� �⺻Ÿ�Կ��� �����͸� �����ϴ� ���°� ���� �ٸ���.
		int a = 100;
		int b = a;
		System.out.println(a==b);
		
		/* �迭�� ���� */
		int[] arr = {10, 20, 30};//���� �迭
		
		//1. ���� ����(���۷��� ����)
		//�迭�� �����ϴ� ��ü�� ����
		int[] refCopy = arr;//�迭�� �ּ� ����
		System.out.println(refCopy==arr); //���� ���� �ּ� ����

		//�ּҰ� ���� �� �迭�� �����͵� ���� ���� ����
		arr[0] = 500; //���� ������ ����
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("refCopy[0]: " + refCopy[0]);
		refCopy[1] = 1000;
		System.out.println("arr ������: " + Arrays.toString(arr));
		System.out.println("refCopy ������: " + Arrays.toString(refCopy));
		
		System.out.println("============================");
		arr[0] = 10;
		arr[1] = 20;
		
		//2. ���� ����(�� ����)
		//�迭�� ���� �����ؼ� ����
		int[] valCopy = {arr[0], arr[1], arr[2]}; //�迭�� �����Ͱ� ����
		System.out.println(Arrays.toString(valCopy));
		System.out.println(valCopy==arr);
		valCopy[0] = -1;
		System.out.println("valCopy ������: " + Arrays.toString(valCopy));
		System.out.println("arr ������: " + Arrays.toString(arr));
		
		//clone(): �迭 ���� ����
		int[] arrClone = arr.clone();
		System.out.println("arrClone ������: " + Arrays.toString(arrClone));
		System.out.println(arrClone==arr);
		
		//�ּ� Ȯ��
		System.out.println("arr: " + arr);
		System.out.println("refCopy: " + refCopy);
		System.out.println("valCopy: " + valCopy);
		System.out.println("arrClone: " + arrClone);
	}
}







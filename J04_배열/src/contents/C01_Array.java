/*
# �迭(Array)
���� �ڷ����� ������ �����͸� ��� �����ϴ� ����.
index��ȣ�� 0���� ù��°�̸� ������ ������. 
ó�� ������ �� �迭�� ũ�⸦ ���ؾ��ϸ�, �� �� ũ�⸦ ���ϸ� ������ �� ����.

# �迭 ���� ���
1. ������ ������� �迭 �����ϱ�
	�ڷ���[] ������ = {������1, ������2, ������3..};

2. newŰ����� �迭 �����ϱ�
 1) �迭 ���� ����
 	�ڷ���[] ������;
 	�ڷ��� ������[];
 
 2) �迭�� ��ü ����
 	������ = new �ڷ���[����];
 	
 3) �迭�� �ʱ�ȭ

# �迭�� ����(ũ��, ����)
	�迭��.length
	
# �迭 ������ �����ϱ�
	�迭��[index] = ������;

*/
package contents;

import java.util.Scanner;

public class C01_Array {
	public static void main(String[] args) {
		/* �迭 �����ϱ�1 */
		System.out.println("=====�迭 �����ϱ�1=====");
		//���� ������ 10, 20, 30 3���� ������ �����ϱ�
		int a = 10, b = 20, c = 30;
		
		//�迭 ����� ���ÿ� �ʱ�ȭ
		int[] arr = {10, 20, 30};
		
//		System.out.println(arr);
		System.out.println("ù��° ��: " + arr[0]);//0��: ù��°
		System.out.println("�ι�° ��: " + arr[1]);//1��: �ι�°
		System.out.println("����° ��: " + arr[2]);//2��: ����°
		
		//�迭�� ����(ũ��, ����) ���ϱ� => �迭��.length
		System.out.println("�迭�� ����: " + arr.length);
		
		//�ݺ������� �迭 ������ ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			System.out.println(arr[i]);
		}
		
		//�迭 ������ �����ϱ�
		arr[0] = 200;
		System.out.println("arr[0] = " + arr[0]);
		arr[1] = arr[0] + 50;
		System.out.println("arr[1] = " + arr[1]);
		arr[2] = arr[0] + arr[1];
		System.out.println("arr[2] = " + arr[2]);
		
		//�迭 ������ �س���, ���߿� ������ ����� ���� ���
		int[] arr2;
//		arr2 = {10, 20, 30}; ����
		arr2 = new int[] {10, 20, 30};
		
		/* �迭 �����ϱ�2 */
		System.out.println("=====�迭 �����ϱ�2=====");
		int[] ref = new int[3]; //�迭 ����
		ref[0] = 10;
		ref[1] = 20;
		ref[2] = 30;
		
		//��� �迭���� 15�� ���ϰ� �� ����ϱ�
		for (int i = 0; i < ref.length; i++) {
			ref[i] += 15;
		}
		for (int i = 0; i < ref.length; i++) {
			System.out.println("ref[" + i + "] = " + ref[i]);
		}
		
		/* �迭 �Է¹ޱ� */
		System.out.println("=====�迭 �Է¹ޱ�=====");
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+"�� �迭 �Է�: ");
			num[i] = sc.nextInt();
		}
		
		System.out.print("�Է¹��� �迭: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}

















/*
# ��Ŭ���� ����Ű
1. ������Ʈâ
���������� ��üȭ��: ctrl + M 
ȭ�� ���� ����: ctrl + shift + {
ȭ�� ���� ����: ctrl + shift + __ 

2. �ڵ� �ۼ���
�ڵ� �ڵ�����: ctrl + shift + f
����(����) �̵�: alt + ��,��
����(����) ����: alt + ctrl + ��,��
����(����) ����: ctrl + D
*/
package contents;

public class C00_Shortcut {
	public static void main(String[] args) {
		int[] arr = { 20, 55, 10, 3, 85, 36, 70, 64 };
		int max = arr[0];
		int min = arr[0];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			sum += arr[i];
		}

		double avg = (double) sum / arr.length;
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		System.out.println("��հ�: " + avg);
	}
}

/*
Q)  �ݺ����� ����Ͽ� ���� �迭 ���� �߿��� 
	�ִ밪�� �ּҰ��� ã�� ��հ��� ���Ͻÿ�.
    [20, 55, 10, 3, 85, 36, 70, 64]

    �� Conslole ��  
    �ִ밪: 85
    �ּҰ�: 3
    ��հ�: 42.875

*/
package practice;

public class Prac03 {
	public static void main(String[] args) {
		int[] arr = {20, 55, 10, 3, 85, 36, 70, 64};
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
		
		double avg = (double)sum/arr.length;
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		System.out.println("��հ�: " + avg);
	}
}





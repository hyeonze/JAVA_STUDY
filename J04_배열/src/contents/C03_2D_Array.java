/*
# 2���� �迭 ����
	�ڷ���[][] �迭�� = {{�����͸��1}, {�����͸��2}, {�����͸��3},... };
	�ڷ���[][] �迭�� = new �ڷ���[�ళ��][������];
	
# ���(Matrix): [������][���ο�]

*/
package contents;

public class C03_2D_Array {
	public static void main(String[] args) {
		/* 2���� �迭 �����ϱ�1 */
		System.out.println("=====2���� �迭 �����ϱ�1=====");
		int[] numbers1 = { 5, 10, 15, 20, 25 };
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		int[] numbers3 = { 15, 30, 45, 60, 75 };
		
		//������ �� �迭 ����
		int[][] arr1 = {
				{ 5, 10, 15, 20, 25 },
				{ 10, 20, 30, 40, 50 },
				{ 15, 30, 45, 60, 75 }
		};
		int[][] arr2 = {numbers1, numbers2, numbers3};
		
		//2���� �迭�� ����(����, ũ��)
		System.out.println("�ళ��: "+ arr1.length);
		System.out.println("������: "+ arr1[0].length);
		
		//2���� �迭 ������ �����ϱ�
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][2]);
		System.out.println(arr1[1][3]);
		System.out.println(arr1[2][2]);
		
		//2���� �迭 ��ü ������ Ȯ���ϱ�
		for (int i = 0; i < arr1.length; i++) {//�ళ��(3)
			for (int j = 0; j < arr1[i].length; j++) {// ������(5)
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		/* 2���� �迭 �����ϱ�2 */
		System.out.println("=====2���� �迭 �����ϱ�2=====");
		int[][] num = new int[2][3];
		int a = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = a;
				a++;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		//����: ����for������ arr1�� ���� �迭�� ����� ����غ���
		int[][] arr3 = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				arr3[i][j] = 5 * (j + 1) * (i + 1);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	}
}










package practice;

public class Prac01 {
	public static void main(String[] args) {
		//�־��� �迭
		int[] arr = new int[5];
		
		// Q1) 10���� 50���� arr�迭�� �����ϰ� ����ϱ�
		// ���) 10 20 30 40 50
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// Q2) ��ü �� ����ϱ�
		// ���) 150
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("��ü ��: " + sum);
		
		// Q3) 4�� ����� ����ϱ�
		// ���) 20 40
		System.out.print("4�� ���: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		// Q4) 20�� ����� �� ����ϱ�
		// ���) 60
		// Q5) 20�� ����� ���� ����ϱ�
		// ���) 2
		int sum20 = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 20 == 0) {
				sum20 += arr[i];
				count++;
			}
		}
		System.out.println("20�� ����� ��: " + sum20);
		System.out.println("20�� ��� ����: " + count);
		
		
		
	}
}






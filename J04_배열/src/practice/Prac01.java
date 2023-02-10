package practice;

public class Prac01 {
	public static void main(String[] args) {
		//주어진 배열
		int[] arr = new int[5];
		
		// Q1) 10부터 50까지 arr배열에 저장하고 출력하기
		// 결과) 10 20 30 40 50
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// Q2) 전체 합 출력하기
		// 결과) 150
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("전체 합: " + sum);
		
		// Q3) 4의 배수만 출력하기
		// 결과) 20 40
		System.out.print("4의 배수: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		// Q4) 20의 배수의 합 출력하기
		// 결과) 60
		// Q5) 20의 배수의 개수 출력하기
		// 결과) 2
		int sum20 = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 20 == 0) {
				sum20 += arr[i];
				count++;
			}
		}
		System.out.println("20의 배수들 합: " + sum20);
		System.out.println("20의 배수 개수: " + count);
		
		
		
	}
}






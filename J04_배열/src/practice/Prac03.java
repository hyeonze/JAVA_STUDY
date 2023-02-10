/*
Q)  반복문을 사용하여 다음 배열 값들 중에서 
	최대값과 최소값을 찾고 평균값을 구하시오.
    [20, 55, 10, 3, 85, 36, 70, 64]

    ↓ Conslole ↓  
    최대값: 85
    최소값: 3
    평균값: 42.875

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
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		System.out.println("평균값: " + avg);
	}
}





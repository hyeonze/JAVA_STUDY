/*
Q)  먼저 생성할 정수형 배열의 개수를 사용자로부터 입력 받고,
	해당하는 배열의 개수만큼 정수를 모두 입력받아 평균값을 계산하여 
	아래 화면처럼 결과가 나오도록 출력해보자.

	↓ Console1 ↓
	생성할 배열의 개수: 2
	정수를 입력하시오: 10
	정수를 입력하시오: 20
	평균은 15.0입니다.

    ↓ Console2 ↓
	생성할 배열의 개수: 5
	정수를 입력하시오: 10
	정수를 입력하시오: 20
	정수를 입력하시오: 25
	정수를 입력하시오: 30
	정수를 입력하시오: 35
	평균은 24.0입니다.
*/
package practice;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 개수: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		//배열의 개수만큼 정수를 사용자로부터 입력받기
		for (int i = 0; i < size; i++) {
			System.out.print("정수를 입력하시오: ");
			num[i] = sc.nextInt();
		}
		
		//배열의 모든 정수 데이터의 평균값 구하기
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += num[i];
		}
		
		//실수로 타입 변환해서 평균계산
		double avg = (double)sum / size;
		System.out.println("평균은 " + avg + "입니다.");
		
	}
}



















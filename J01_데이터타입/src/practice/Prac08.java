/*
Q)	2개의 실수를 입력받아서 두 수의 정수부분만 더한 값을 출력해보자

    ↓ Console ↓
	첫 번째 실수를 입력하시오: 1.67
	두 번째 실수를 입력하시오: 2.45
	정수 부분의 합은 3

*/
package practice;

import java.util.Scanner;

public class Prac08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 실수를 입력하시오: ");
		double num1 = sc.nextDouble();
		System.out.print("두 번째 실수를 입력하시오: ");
		double num2 = sc.nextDouble();
		
		int sum = (int)num1 + (int)num2;
		System.out.println("정수 부분의 합은 " + sum);
	}
}






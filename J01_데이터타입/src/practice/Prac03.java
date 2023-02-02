/*
Q)	두 수를 연산해보자.
	사용자로부터 두 개의 정수를 입력받아 변수 각각에 저장하고, 
	출력문을 이용해 두 수의 연산 결과를 나타내보자.

	↓ Console ↓
 	정수1 입력: 17
	정수2 입력: 3
	========연산 결과========
	덧셈: 20
	뺄셈: 14
	곱셈: 51
	나눈 몫: 5
	나눈 나머지: 2
*/
package practice;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("========연산 결과========");
		System.out.println("덧셈: " + (num1 + num2));
		System.out.println("뺄셈: " + (num1 - num2));
		
		int mul = num1*num2;
		System.out.println("곱셈: " + mul);
		
		int div = num1/num2;
		System.out.println("나눈 몫: " + div);
		
		int rest = num1%num2;
		System.out.println("나눈 나머지: " + rest);
	}
}


















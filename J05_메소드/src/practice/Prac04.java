/*
Q) 	사용자로부터 두 개의 정수를 입력받고,
   	매개변수와 리턴값을 가지는 add, sub, mul, div의 메소드 중에서 
   	실행할 메소드를 선택하여 두 수의 연산 결과값 중 
   	하나를 출력하도록 코드를 작성하시오.

	↓ Console1 ↓				
    정수1 입력: 10
    정수2 입력: 20
    ---------------
    두 수의 연산 선택
    ---------------
    1. 합
    2. 차
    3. 곱
    4. 나눗셈
    ---------------
    연산을 선택하시오: 2
    연산 결과: -10

    ↓ Console2 ↓
    정수1 입력: 10
    정수2 입력: 20
    ---------------
    두 수의 연산 선택
    ---------------
    1. 합
    2. 차
    3. 곱
    4. 나눗셈
    ---------------
    연산을 선택하시오: 4
    연산 결과: 0.5

*/


package practice;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("---------------\r\n"
				+ "두 수의 연산 선택\r\n"
				+ "---------------\r\n"
				+ "1. 합\r\n"
				+ "2. 차\r\n"
				+ "3. 곱\r\n"
				+ "4. 나눗셈\r\n"
				+ "---------------");
		System.out.print("연산을 선택하시오: ");
		int menu = sc.nextInt();
		
		System.out.print("연산 결과: " );
		switch(menu) {
		case 1:
			System.out.println(add(num1, num2));
			break;
		case 2:
			System.out.println(sub(num1, num2));
			break;
		case 3:
			System.out.println(mul(num1, num2));
			break;
		case 4:
			System.out.println(div(num1, num2));
			break;
		}
	}
	
	//연산 메소드 선언
	static int add(int a, int b) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
	
	static int mul(int a, int b) {
		return a * b;
	}
	
	static double div(int a, int b) {
		return (double)a / b;
	}
}











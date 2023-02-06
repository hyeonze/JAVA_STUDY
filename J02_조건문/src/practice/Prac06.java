/*
Q)  사용자로부터 세 개의 숫자를 입력 받은 후 가장 큰 숫자를 출력하라.

    ↓ 실행화면 ↓
    input num1: 10
    input num2: 9
    input num3: 20
    가장 큰 수: 20

*/

package practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input num1: ");
		int num1 = sc.nextInt();
		System.out.print("input num2: ");
		int num2 = sc.nextInt();
		System.out.print("input num3: ");
		int num3 = sc.nextInt();
		
		//1. 중첩조건문 사용
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("가장 큰 수: "+num1);
			}else { //num1 <= num3
				System.out.println("가장 큰 수: "+num3);
			}
		}else { //num1 <= num2
			if(num2 > num3) {
				System.out.println("가장 큰 수: " + num2);
			}else { //num2 <= num3
				System.out.println("가장 큰 수: " + num3);
			}
		}
		
		//2. 논리연산자 사용
		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수: " + num2);
		} else {
			System.out.println("가장 큰 수: " + num3);
		}
		
		//3. 최대값 찾을 변수 도입(자료구조)
		int max = num1; 
		if(num2 > max) {
			max = num2;
		} //num1과 num2 중 더 큰 수가 max에 저장
		
		if(num3 > max) {
			max = num3;
		} //num1, num2보다 num3가 더 크면 max에 해당값 대입
		//num3가 더 작으면 if문 실행X
		
		System.out.println("가장 큰 수: " + max);
	}
}








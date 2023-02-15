/*
Q)	주어진 정수의 약수를 모두 찾아내는 메소드 
	show_divisor(int num)를 작성하시오.
    사용자로부터 정수값을 입력받아서
    해당 정수의 약수를 모두 출력하는 메소드를 만들고 실행하시오.

	↓ Console ↓
	정수 입력: 8
	1 2 4 8
*/
package practice;

import java.util.Scanner;

public class Prac02 {
	//메소드 선언
	static void show_divisor(int num) {
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i +" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		//메소드 호출
		show_divisor(n);
	}
}
